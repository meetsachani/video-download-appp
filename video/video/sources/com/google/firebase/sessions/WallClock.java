package com.google.firebase.sessions;

import android.os.SystemClock;
import o.C6223f80;
import o.EnumC6964i80;
import o.Y70;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class WallClock implements TimeProvider {
    @NotNull
    public static final WallClock a = new WallClock();
    public static final long b = 1000;

    private WallClock() {
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public long a() {
        Y70.a aVar = Y70.Y;
        return C6223f80.x(SystemClock.elapsedRealtime(), EnumC6964i80.Y0);
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public long b() {
        return System.currentTimeMillis() * 1000;
    }
}
