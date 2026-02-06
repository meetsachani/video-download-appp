package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;

/* loaded from: classes3.dex */
public enum EventType implements NumberedEnum {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);
    
    public final int X;

    EventType(int i) {
        this.X = i;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int k() {
        return this.X;
    }
}
