/*******************************************************************************
 * Copyright (c) 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.microprofile.appConfig.converters.test;

import org.eclipse.microprofile.config.spi.Converter;

public class DiscoveredConverterCat implements Converter<Cat> {

    /** {@inheritDoc} */
    @Override
    public Cat convert(String value) {
        Cat result = null;
        try {
            result = new Cat(value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return result;
    }

}