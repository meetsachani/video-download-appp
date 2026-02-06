package com.google.firebase.heartbeatinfo;

import java.util.List;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class HeartBeatResult {
    public static HeartBeatResult a(String str, List<String> list) {
        return new AutoValue_HeartBeatResult(str, list);
    }

    public abstract List<String> b();

    public abstract String c();
}
