/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.akt7;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class OfficesFacade extends AbstractFacade<Offices> {

    @PersistenceContext(unitName = "com.test_akt7_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OfficesFacade() {
        super(Offices.class);
    }
    
}
