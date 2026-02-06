package com.google.firebase.sessions.settings;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import o.AbstractC4225Si2;
import o.C6562gT0;
import o.C7289jT0;
import o.C7458kA2;
import o.FV;
import o.HM;
import o.InterfaceC9974uQ;
import o.RP1;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@FV(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", i = {}, l = {68, 70, 73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class RemoteSettingsFetcher$doConfigFetch$2 extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
    public int Z0;
    public final /* synthetic */ RemoteSettingsFetcher a1;
    public final /* synthetic */ Map<String, String> b1;
    public final /* synthetic */ VA0<JSONObject, HM<? super C7458kA2>, Object> c1;
    public final /* synthetic */ VA0<String, HM<? super C7458kA2>, Object> d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoteSettingsFetcher$doConfigFetch$2(RemoteSettingsFetcher remoteSettingsFetcher, Map<String, String> map, VA0<? super JSONObject, ? super HM<? super C7458kA2>, ? extends Object> va0, VA0<? super String, ? super HM<? super C7458kA2>, ? extends Object> va02, HM<? super RemoteSettingsFetcher$doConfigFetch$2> hm) {
        super(2, hm);
        this.a1 = remoteSettingsFetcher;
        this.b1 = map;
        this.c1 = va0;
        this.d1 = va02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
        if (r8.i(r1, r7) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
        if (r1.i(r3, r7) != r0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
    @Override // o.AbstractC5644cl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(@NotNull Object obj) {
        URL c;
        Object l = C7289jT0.l();
        int i = this.Z0;
        try {
        } catch (Exception e) {
            VA0<String, HM<? super C7458kA2>, Object> va0 = this.d1;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.Z0 = 3;
        }
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
            }
        } else {
            RT1.n(obj);
            c = this.a1.c();
            URLConnection openConnection = c.openConnection();
            C6562gT0.n(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry<String, String> entry : this.b1.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                RP1.h hVar = new RP1.h();
                while (true) {
                    ?? readLine = bufferedReader.readLine();
                    hVar.X = readLine;
                    if (readLine == 0) {
                        break;
                    }
                    sb.append((String) readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                VA0<JSONObject, HM<? super C7458kA2>, Object> va02 = this.c1;
                this.Z0 = 1;
                if (va02.i(jSONObject, this) == l) {
                    return l;
                }
            } else {
                VA0<String, HM<? super C7458kA2>, Object> va03 = this.d1;
                String str = "Bad response code: " + responseCode;
                this.Z0 = 2;
            }
        }
        return C7458kA2.a;
    }

    @Override // o.VA0
    @Nullable
    /* renamed from: U */
    public final Object i(@NotNull InterfaceC9974uQ interfaceC9974uQ, @Nullable HM<? super C7458kA2> hm) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.a1, this.b1, this.c1, this.d1, hm);
    }
}
