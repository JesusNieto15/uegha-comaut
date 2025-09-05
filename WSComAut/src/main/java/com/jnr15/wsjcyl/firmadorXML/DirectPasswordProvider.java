/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15.wsjcyl.firmadorXML;

import java.security.cert.X509Certificate;
import xades4j.providers.impl.KeyStoreKeyingDataProvider.KeyEntryPasswordProvider;
import xades4j.providers.impl.KeyStoreKeyingDataProvider.KeyStorePasswordProvider;
/**
 *
 * @author inven
 */
public class DirectPasswordProvider implements KeyStorePasswordProvider,KeyEntryPasswordProvider{
    
    private char[] password;
    
    public DirectPasswordProvider(String password)
    {
        this.password = password.toCharArray();
    }

    @Override
    public char[] getPassword() {
        return password;
    }

    @Override
    public char[] getPassword(String string, X509Certificate xc) {
        return password;
    }
    
}
