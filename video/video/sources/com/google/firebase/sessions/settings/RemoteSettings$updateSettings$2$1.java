package com.google.firebase.sessions.settings;

import android.util.Log;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import o.AbstractC4225Si2;
import o.C10557wp;
import o.C3503Kz;
import o.C6562gT0;
import o.C7289jT0;
import o.C7458kA2;
import o.FV;
import o.HM;
import o.RP1;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@FV(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {0, 0, 0, 1, 1, 2}, l = {125, 128, 131, C3503Kz.W, 134, 136}, m = "invokeSuspend", n = {"sessionSamplingRate", "sessionTimeoutSeconds", "cacheDuration", "sessionSamplingRate", "cacheDuration", "cacheDuration"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
public final class RemoteSettings$updateSettings$2$1 extends AbstractC4225Si2 implements VA0<JSONObject, HM<? super C7458kA2>, Object> {
    public Object Z0;
    public Object a1;
    public int b1;
    public /* synthetic */ Object c1;
    public final /* synthetic */ RemoteSettings d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, HM<? super RemoteSettings$updateSettings$2$1> hm) {
        super(2, hm);
        this.d1 = remoteSettings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0113, code lost:
        if (r13.s((java.lang.Integer) r8.X, r12) == r4) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
        if (r13.o((java.lang.Double) r1.X, r12) == r4) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
        if (r13.p((java.lang.Integer) r0.X, r12) == r4) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0177, code lost:
        if (r13.p(r0, r12) == r4) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
        if (r13.q(r0, r12) == r4) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
    @Override // o.AbstractC5644cl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(@NotNull Object obj) {
        RP1.h hVar;
        Boolean bool;
        RP1.h hVar2;
        RP1.h hVar3;
        SettingsCache settingsCache;
        RP1.h hVar4;
        RP1.h hVar5;
        SettingsCache settingsCache2;
        SettingsCache settingsCache3;
        C7458kA2 c7458kA2;
        SettingsCache settingsCache4;
        SettingsCache settingsCache5;
        SettingsCache settingsCache6;
        Object l = C7289jT0.l();
        switch (this.b1) {
            case 0:
                RT1.n(obj);
                JSONObject jSONObject = (JSONObject) this.c1;
                Log.d(RemoteSettings.h, "Fetched settings: " + jSONObject);
                RP1.h hVar6 = new RP1.h();
                hVar = new RP1.h();
                RP1.h hVar7 = new RP1.h();
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    C6562gT0.n(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        if (jSONObject2.has("sessions_enabled")) {
                            bool = (Boolean) jSONObject2.get("sessions_enabled");
                        } else {
                            bool = null;
                        }
                        try {
                            if (jSONObject2.has("sampling_rate")) {
                                hVar6.X = (Double) jSONObject2.get("sampling_rate");
                            }
                            if (jSONObject2.has("session_timeout_seconds")) {
                                hVar.X = (Integer) jSONObject2.get("session_timeout_seconds");
                            }
                            if (jSONObject2.has(SettingsJsonConstants.e)) {
                                hVar7.X = (Integer) jSONObject2.get(SettingsJsonConstants.e);
                            }
                        } catch (JSONException e) {
                            e = e;
                            Log.e(RemoteSettings.h, "Error parsing the configs remotely fetched: ", e);
                            if (bool == null) {
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        bool = null;
                    }
                } else {
                    bool = null;
                }
                if (bool == null) {
                    settingsCache = this.d1.e;
                    this.c1 = hVar6;
                    this.Z0 = hVar;
                    this.a1 = hVar7;
                    this.b1 = 1;
                    if (settingsCache.t(bool, this) != l) {
                        hVar4 = hVar6;
                        hVar5 = hVar;
                        hVar3 = hVar7;
                        hVar = hVar5;
                        hVar2 = hVar4;
                        if (((Integer) hVar.X) != null) {
                            settingsCache2 = this.d1.e;
                            this.c1 = hVar2;
                            this.Z0 = hVar3;
                            this.a1 = null;
                            this.b1 = 2;
                            break;
                        }
                        if (((Double) hVar2.X) != null) {
                            settingsCache3 = this.d1.e;
                            this.c1 = hVar3;
                            this.Z0 = null;
                            this.a1 = null;
                            this.b1 = 3;
                            break;
                        }
                        if (((Integer) hVar3.X) != null) {
                            settingsCache4 = this.d1.e;
                            this.c1 = null;
                            this.Z0 = null;
                            this.a1 = null;
                            this.b1 = 4;
                            break;
                        } else {
                            c7458kA2 = null;
                            if (c7458kA2 == null) {
                                settingsCache5 = this.d1.e;
                                Integer f = C10557wp.f(86400);
                                this.c1 = null;
                                this.Z0 = null;
                                this.a1 = null;
                                this.b1 = 5;
                                break;
                            }
                            settingsCache6 = this.d1.e;
                            Long g = C10557wp.g(System.currentTimeMillis());
                            this.c1 = null;
                            this.Z0 = null;
                            this.a1 = null;
                            this.b1 = 6;
                            break;
                        }
                    }
                    return l;
                }
                hVar2 = hVar6;
                hVar3 = hVar7;
                if (((Integer) hVar.X) != null) {
                }
                if (((Double) hVar2.X) != null) {
                }
                if (((Integer) hVar3.X) != null) {
                }
            case 1:
                hVar3 = (RP1.h) this.a1;
                hVar5 = (RP1.h) this.Z0;
                hVar4 = (RP1.h) this.c1;
                RT1.n(obj);
                hVar = hVar5;
                hVar2 = hVar4;
                if (((Integer) hVar.X) != null) {
                }
                if (((Double) hVar2.X) != null) {
                }
                if (((Integer) hVar3.X) != null) {
                }
                break;
            case 2:
                hVar3 = (RP1.h) this.Z0;
                hVar2 = (RP1.h) this.c1;
                RT1.n(obj);
                if (((Double) hVar2.X) != null) {
                }
                if (((Integer) hVar3.X) != null) {
                }
                break;
            case 3:
                hVar3 = (RP1.h) this.c1;
                RT1.n(obj);
                if (((Integer) hVar3.X) != null) {
                }
                break;
            case 4:
                RT1.n(obj);
                c7458kA2 = C7458kA2.a;
                if (c7458kA2 == null) {
                }
                settingsCache6 = this.d1.e;
                Long g2 = C10557wp.g(System.currentTimeMillis());
                this.c1 = null;
                this.Z0 = null;
                this.a1 = null;
                this.b1 = 6;
                break;
            case 5:
                RT1.n(obj);
                settingsCache6 = this.d1.e;
                Long g22 = C10557wp.g(System.currentTimeMillis());
                this.c1 = null;
                this.Z0 = null;
                this.a1 = null;
                this.b1 = 6;
                break;
            case 6:
                RT1.n(obj);
                return C7458kA2.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // o.VA0
    @Nullable
    /* renamed from: U */
    public final Object i(@NotNull JSONObject jSONObject, @Nullable HM<? super C7458kA2> hm) {
        return ((RemoteSettings$updateSettings$2$1) t(jSONObject, hm)).F(C7458kA2.a);
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.d1, hm);
        remoteSettings$updateSettings$2$1.c1 = obj;
        return remoteSettings$updateSettings$2$1;
    }
}
