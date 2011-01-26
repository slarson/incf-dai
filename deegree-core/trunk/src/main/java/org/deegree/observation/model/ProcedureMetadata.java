//$HeadURL: http://svn.wald.intevation.org/svn/deegree/deegree3/branches/3.0/deegree-core/src/main/java/org/deegree/observation/model/ProcedureMetadata.java $
/*----------------------------------------------------------------------------
 This file is part of deegree, http://deegree.org/
 Copyright (C) 2001-2009 by:
 - Department of Geography, University of Bonn -
 and
 - lat/lon GmbH -

 This library is free software; you can redistribute it and/or modify it under
 the terms of the GNU Lesser General Public License as published by the Free
 Software Foundation; either version 2.1 of the License, or (at your option)
 any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 details.
 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation, Inc.,
 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 Contact information:

 lat/lon GmbH
 Aennchenstr. 19, 53177 Bonn
 Germany
 http://lat-lon.de/

 Department of Geography, University of Bonn
 Prof. Dr. Klaus Greve
 Postfach 1147, 53001 Bonn
 Germany
 http://www.geographie.uni-bonn.de/deegree/

 e-mail: info@deegree.org
 ----------------------------------------------------------------------------*/
package org.deegree.observation.model;

import java.net.URL;

/**
 * The <code>ProcedureMetadata</code> class encapsulates the metadata of a procedure (as it is found in the sos
 * configuration).
 * 
 * @author <a href="mailto:ionita@lat-lon.de">Andrei Ionita</a>
 * 
 * @author last edited by: $Author: aionita $
 * 
 * @version $Revision: 24362 $, $Date: 2010-05-12 06:42:07 -0700 (Wed, 12 May 2010) $
 * 
 */
public class ProcedureMetadata {

    private final String procedureHref;

    private final String featureOfInterestHref;

    private final URL sensorURL;

    /**
     * @param procedureHref
     * @param featureOfInterestHref
     * @param sensorURL
     */
    public ProcedureMetadata( String procedureHref, String featureOfInterestHref, URL sensorURL ) {
        this.procedureHref = procedureHref;
        this.featureOfInterestHref = featureOfInterestHref;
        this.sensorURL = sensorURL;
    }

    /**
     * @return
     */
    public String getProcedureHref() {
        return procedureHref;
    }

    /**
     * @return
     */
    public String getFeatureOfInterestHref() {
        return featureOfInterestHref;
    }

    /**
     * @return
     */
    public URL getSensorURL() {
        return sensorURL;
    }
}
