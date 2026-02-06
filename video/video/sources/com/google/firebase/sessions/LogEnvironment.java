package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;

/* loaded from: classes3.dex */
public enum LogEnvironment implements NumberedEnum {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    public final int X;

    LogEnvironment(int i) {
        this.X = i;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int k() {
        return this.X;
    }
}
