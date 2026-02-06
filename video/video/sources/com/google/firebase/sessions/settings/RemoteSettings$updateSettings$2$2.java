package com.google.firebase.sessions.settings;

import android.util.Log;
import o.AbstractC4225Si2;
import o.C7289jT0;
import o.C7458kA2;
import o.FV;
import o.HM;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class RemoteSettings$updateSettings$2$2 extends AbstractC4225Si2 implements VA0<String, HM<? super C7458kA2>, Object> {
    public int Z0;
    public /* synthetic */ Object a1;

    public RemoteSettings$updateSettings$2$2(HM<? super RemoteSettings$updateSettings$2$2> hm) {
        super(2, hm);
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        C7289jT0.l();
        if (this.Z0 == 0) {
            RT1.n(obj);
            Log.e(RemoteSettings.h, "Error failing to fetch the remote configs: " + ((String) this.a1));
            return C7458kA2.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // o.VA0
    @Nullable
    /* renamed from: U */
    public final Object i(@NotNull String str, @Nullable HM<? super C7458kA2> hm) {
        return ((RemoteSettings$updateSettings$2$2) t(str, hm)).F(C7458kA2.a);
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(hm);
        remoteSettings$updateSettings$2$2.a1 = obj;
        return remoteSettings$updateSettings$2$2;
    }
}
