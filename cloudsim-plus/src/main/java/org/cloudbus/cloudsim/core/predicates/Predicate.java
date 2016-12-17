/*
 * Title:        CloudSim Toolkit
 * Description:  CloudSim (Cloud Simulation) Toolkit for Modeling and Simulation of Clouds
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2009-2012, The University of Melbourne, Australia
 */

package org.cloudbus.cloudsim.core.predicates;

import org.cloudbus.cloudsim.core.events.SimEvent;

/**
 * Predicates are used to select events from the deferred queue, according to
 * required criteria.
 * They are used internally the by {@link org.cloudbus.cloudsim.core.CloudSim} class
 * and aren't intended to be used directly by the user.
 * <p>
 * This class is abstract and must be
 * extended when writing a new predicate. Each subclass define
 * the criteria to select received events.
 * <p>
 * Some standard predicates are provided.<br>
 * The idea of simulation predicates was copied from SimJava 2.
 *
 * @author Marcos Dias de Assuncao
 * @todo It should be used the native {@link java.util.function.Predicate} interface from Java 8.
 * @see PredicateType
 * @see PredicateFrom
 * @see PredicateAny
 * @see PredicateNone
 * @since CloudSim Toolkit 1.0
 */
public interface Predicate extends java.util.function.Predicate<SimEvent> {

    /**
     * Verifies if a given event matches the required criteria.
     * The method is called for each event in the deferred queue when a method such as
     * {@link org.cloudbus.cloudsim.core.CloudSim#select(int, org.cloudbus.cloudsim.core.predicates.Predicate) }
     * is called.
     *
     * @param event The event to test for a match.
     * @return <code>true</code> if the event matches and should be
     * selected, or <code>false</code> if it does not match the predicate.
     */
    @Override
    boolean test(SimEvent event);
}
