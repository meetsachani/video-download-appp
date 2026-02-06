package com.google.firebase.heartbeatinfo;

import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public interface HeartBeatInfo {

    /* loaded from: classes3.dex */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        public final int X;

        HeartBeat(int i) {
            this.X = i;
        }

        public int e() {
            return this.X;
        }
    }

    @InterfaceC5670cr1
    HeartBeat b(@InterfaceC5670cr1 String str);
}
