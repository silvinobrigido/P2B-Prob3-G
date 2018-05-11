package br.furb.programacaoii.problema3.factory;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import br.furb.programacaoii.problema3.controller.Controller;

/**
 * Define a fabrica de controladores. Realiza uma especide de Singleton nos
 * controladores, mantendo e retornando somente uma instancia de cada
 * controlador.
 *
 * @author ariel
 */
public abstract class ControllerFactory {

	private static final Map<String, Controller> map = new HashMap<>();

	@SuppressWarnings("unchecked")
	public static <C extends Controller> C getController(Class<C> clazz) {
		String nomeClasse = getNomeClasse(clazz);

		C controller = (C) map.get(nomeClasse);

		if (null == controller) {
			controller = instanciarController(clazz);
			map.put(nomeClasse, controller);
		}

		return controller;
	}

	@SuppressWarnings("unchecked")
	private static <C extends Controller> C instanciarController(Class<C> clazz) {
		Constructor<?>[] constructors = clazz.getConstructors();
		for (Constructor<?> constructor : constructors) {
			if (0 == constructor.getParameterCount()) {
				try {
					return (C) constructor.newInstance(new Object[] {});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	private static <C extends Controller> String getNomeClasse(Class<C> clazz) {
		return clazz.getName();
	}
}
