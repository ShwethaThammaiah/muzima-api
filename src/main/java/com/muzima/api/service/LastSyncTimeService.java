package com.muzima.api.service;

import com.google.inject.ImplementedBy;
import com.muzima.api.model.APIName;
import com.muzima.api.model.LastSyncTime;
import com.muzima.api.service.impl.LastSyncTimeServiceImpl;

import java.io.IOException;
import java.util.Date;

@ImplementedBy(LastSyncTimeServiceImpl.class)
public interface LastSyncTimeService  extends MuzimaInterface{

    Date getLastSyncTimeFor(APIName apiName) throws IOException, IncorrectParamSignatureException;

    Date getLastSyncTimeFor(APIName apiName, String paramSignature) throws IOException, IncorrectParamSignatureException;

    void saveLastSyncTime(LastSyncTime lastSyncTime) throws IOException;

    public static class IncorrectParamSignatureException extends Throwable{
        public IncorrectParamSignatureException(Throwable throwable){
            super(throwable);
        }
    }
}
