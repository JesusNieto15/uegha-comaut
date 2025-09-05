/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15.wsjcyl.firmadorXML;

import java.util.List;
import xades4j.providers.impl.KeyStoreKeyingDataProvider;

/**
 *
 * @author inven
 */
public class FirstCertificateSelector implements KeyStoreKeyingDataProvider.SigningCertificateSelector {

    @Override
    public Entry selectCertificate(List<Entry> list) {
        return list.get(0);
    }
}
