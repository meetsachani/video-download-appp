package com.google.firebase.sessions.settings;

import o.AbstractC4225Si2;
import o.C3503Kz;
import o.C7289jT0;
import o.C7458kA2;
import o.FV;
import o.HM;
import o.InterfaceC9974uQ;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.settings.RemoteSettings$clearCachedSettings$1", f = "RemoteSettings.kt", i = {}, l = {C3503Kz.k0}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class RemoteSettings$clearCachedSettings$1 extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
    public int Z0;
    public final /* synthetic */ RemoteSettings a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$clearCachedSettings$1(RemoteSettings remoteSettings, HM<? super RemoteSettings$clearCachedSettings$1> hm) {
        super(2, hm);
        this.a1 = remoteSettings;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        SettingsCache settingsCache;
        Object l = C7289jT0.l();
        int i = this.Z0;
        if (i != 0) {
            if (i == 1) {
                RT1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            RT1.n(obj);
            settingsCache = this.a1.e;
            this.Z0 = 1;
            if (settingsCache.j(this) == l) {
                return l;
            }
        }
        return C7458kA2.a;
    }

    @Override // o.VA0
    @Nullable
    /* renamed from: U */
    public final Object i(@NotNull InterfaceC9974uQ interfaceC9974uQ, @Nullable HM<? super C7458kA2> hm) {
        return ((RemoteSettings$clearCachedSettings$1) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        return new RemoteSettings$clearCachedSettings$1(this.a1, hm);
    }
}
