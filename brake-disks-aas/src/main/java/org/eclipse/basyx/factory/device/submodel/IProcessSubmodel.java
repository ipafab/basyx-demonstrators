/*******************************************************************************
* Copyright (C) 2021 the Eclipse BaSyx Authors
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
******************************************************************************/
package org.eclipse.basyx.factory.device.submodel;

import org.eclipse.basyx.factory.product.aas.IProductAAS;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;

/**
 * Interface for the ProcessSubmodel
 * 
 * @author conradi
 *
 */
public interface IProcessSubmodel extends ISubmodel {
	
	public ISubmodelElementCollection getParameters();
	
	public IProperty getCurrentStep();
	
	public IProductAAS getCurrentProduct();
	
	public void setCurrentProduct(IProductAAS product);
	
}
