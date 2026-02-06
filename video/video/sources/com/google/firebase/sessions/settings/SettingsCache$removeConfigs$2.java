package com.google.firebase.sessions.settings;

import o.AbstractC4225Si2;
import o.C2972Fn1;
import o.C7289jT0;
import o.C7458kA2;
import o.FV;
import o.HM;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SettingsCache$removeConfigs$2 extends AbstractC4225Si2 implements VA0<C2972Fn1, HM<? super C7458kA2>, Object> {
    public int Z0;
    public /* synthetic */ Object a1;
    public final /* synthetic */ SettingsCache b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$removeConfigs$2(SettingsCache settingsCache, HM<? super SettingsCache$removeConfigs$2> hm) {
        super(2, hm);
        this.b1 = settingsCache;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        C7289jT0.l();
        if (this.Z0 == 0) {
            RT1.n(obj);
            C2972Fn1 c2972Fn1 = (C2972Fn1) this.a1;
            c2972Fn1.g();
            this.b1.r(c2972Fn1);
            return C7458kA2.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // o.VA0
    @Nullable
    /* renamed from: U */
    public final Object i(@NotNull C2972Fn1 c2972Fn1, @Nullable HM<? super C7458kA2> hm) {
        return ((SettingsCache$removeConfigs$2) t(c2972Fn1, hm)).F(C7458kA2.a);
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        SettingsCache$removeConfigs$2 settingsCache$removeConfigs$2 = new SettingsCache$removeConfigs$2(this.b1, hm);
        settingsCache$removeConfigs$2.a1 = obj;
        return settingsCache$removeConfigs$2;
    }
}
