package com.google.firebase.sessions.settings;

import o.FV;
import o.HM;
import o.KM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", i = {}, l = {112}, m = "updateConfigValue", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SettingsCache$updateConfigValue$1<T> extends KM {
    public /* synthetic */ Object Y0;
    public final /* synthetic */ SettingsCache Z0;
    public int a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$updateConfigValue$1(SettingsCache settingsCache, HM<? super SettingsCache$updateConfigValue$1> hm) {
        super(hm);
        this.Z0 = settingsCache;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        Object n;
        this.Y0 = obj;
        this.a1 |= Integer.MIN_VALUE;
        n = this.Z0.n(null, null, this);
        return n;
    }
}
