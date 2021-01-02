/*******************************************************************************
 * Copyright (c) 2003-2021 Maxprograms.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/epl-v10.html
 *
 * Contributors:
 *     Maxprograms - initial API and implementation
 *******************************************************************************/

module tmengine {

	exports com.maxprograms.tmengine;

	opens com.maxprograms.tmengine to mapdb;

	requires mapdb;
	requires java.xml;
	requires java.base;
	requires java.sql;
	requires jdk.httpserver;
	requires transitive json;
	requires transitive openxliff;
}