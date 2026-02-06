package com.facebook.ads.redexgen.X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C10997yd1;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class Wm implements V9 {
    public static byte[] A0D;
    public static String[] A0E = {"KlcQ4aPMCjTEuj6tlqvSPg02tmhmGUou", "NbdeitWOc1zrv1JDjauqKHmjPPhSGwGe", "R4vSD9xrU3uFkHfeeGcLq0xvgbIcHayT", "rvVAUvGslDbkwSzXQ4gHiQTP5zrG", "ljLEgEfbMYnmdR7mWy3vUvMk8HSCwfcz", "YjYM3cC5SO9DuryblpH9N9a8sNamrwLD", "dglxEHbBnsXp5lOZvNi9PFSn5QE5iyod", "nrMzKM4Ejqm74mRasA"};
    public static final String A0F;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final ConnectivityManager A04;
    public final C1669ge A06;
    public final V8 A07;
    public final InterfaceC1624fv A08;
    public volatile boolean A0C;
    public final Runnable A0A = new C1174Wr(this);
    public final Runnable A09 = new C1173Wq(this);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[2].charAt(25) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[3] = "STFGVVXWKW9SjLATYObI8PiLTu9r";
            strArr[7] = "1bj9PcPMGQWJpkILDx";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
            i4++;
        }
    }

    public static void A07() {
        A0D = new byte[]{106, 121, 99, 84, 88, 117, 111, 108, 125, 104, Byte.MAX_VALUE, 116, 117, 114, 123, 60, 121, 106, 121, 114, 104, 60, 52, 64, 125, 102, 96, 117, 113, 108, 106, 107, C3307Iz.X, 114, 109, 108, 105, 96, C3307Iz.X, 97, 108, 118, 117, 100, 113, 102, 109, 108, 107, 98, C3307Iz.X, 96, 115, 96, 107, 113, 118, C3307Iz.c0, 73, Byte.MAX_VALUE, 104, 108, Byte.MAX_VALUE, 104, 58, 106, 104, 117, 121, Byte.MAX_VALUE, 105, 105, Byte.MAX_VALUE, 126, 58, 106, 123, 104, 110, 115, 123, 118, 58, QC1.w, 123, 110, 121, 114, 54, 58, 121, 117, 116, 110, 115, 116, 111, 115, 116, 125, 58, 110, 117, 58, 116, Byte.MAX_VALUE, 98, 110, 58, 117, 116, Byte.MAX_VALUE, 52, 89, 111, QC1.w, 124, 111, QC1.w, 42, QC1.w, 111, 121, 122, 101, 100, 121, 111, 42, 99, 121, 42, 111, 103, 122, 126, 115, 36, 0, 54, C3307Iz.V, C3307Iz.X, 54, C3307Iz.V, 115, C3307Iz.V, 54, C3307Iz.Z, C3307Iz.Y, C3307Iz.V, C4715Xk.i, 54, 55, 115, 50, 115, C4715Xk.i, 60, C4715Xk.i, 126, 32, C3307Iz.Y, 48, 48, 54, 32, 32, 53, C3307Iz.Y, ED2.a, 115, 32, C3307Iz.Z, 50, C3307Iz.Z, C3307Iz.Y, 32, 115, 48, 60, 55, 54, 115, 60, 53, 115, 70, 112, 103, 99, 112, 103, 53, 98, 116, 102, 53, 96, 123, 116, 119, 121, 112, 53, 97, 122, 53, 101, 103, 122, 118, 112, 102, 102, 53, 116, 121, 121, 53, 112, 99, 112, 123, 97, 102, 57, 53, 97, 103, 108, 124, 123, 114, 53, 116, 114, 116, 124, 123, 59, 57, 1, 3, C8077mf.D, C8077mf.D, 3, 4, 13, 74, C8077mf.p, 3, C8077mf.C, C8077mf.D, C8077mf.m, C8077mf.H, 9, 2, 74, C8077mf.p, 31, C8077mf.q, 74, C8077mf.H, 5, 74, 6, C8077mf.m, 9, 1, 74, 5, C8077mf.n, 74, 9, 5, 4, 4, C8077mf.q, 9, C8077mf.H, 3, 28, 3, C8077mf.H, 19, 68, 74, 95, 95, 78, 70, 91, 95, 93, 81, 80, 80, 91, 93, 74, 87, 72, 87, 74, 71, 32, C3307Iz.X, 48, C3307Iz.X, 3, C8077mf.r, 3, 8, C8077mf.u, C8077mf.y, 59, 42, 50, C3307Iz.Z, 36, 42, 47};
    }

    static {
        A07();
        A0F = V9.class.getSimpleName();
    }

    public Wm(C1669ge c1669ge, V8 v8) {
        this.A07 = v8;
        this.A06 = c1669ge;
        this.A04 = (ConnectivityManager) c1669ge.getSystemService(A03(293, 12, 115));
        this.A08 = C1642gD.A01(c1669ge);
        this.A03 = AbstractC1125Ur.A0K(c1669ge);
        this.A02 = AbstractC1125Ur.A0J(c1669ge);
    }

    public static /* synthetic */ int A00(Wm wm) {
        int i = wm.A00 + 1;
        wm.A00 = i;
        return i;
    }

    private void A05() {
        this.A06.A05().AAO();
        this.A00 = 0;
        this.A01 = 0L;
        if (this.A0B.getQueue().size() == 0) {
            this.A07.ACu();
        }
    }

    private void A06() {
        if (this.A00 >= AbstractC1125Ur.A09(this.A06)) {
            A05();
            A61();
            return;
        }
        int i = this.A00;
        if (A0E[4].charAt(15) == 'm') {
            String[] strArr = A0E;
            strArr[0] = "48XWu56AgSaDG2v80CTGd4cBK4h9Z0cs";
            strArr[1] = "AYX5vj0PphgSAPbgEesjNh2Dg1h2Tuc1";
            if (i == 1) {
                this.A01 = AbstractC1125Ur.A0I(this.A06);
            } else {
                long j = this.A01 * 2;
                String[] strArr2 = A0E;
                if (strArr2[5].charAt(19) == strArr2[6].charAt(19)) {
                    String[] strArr3 = A0E;
                    strArr3[0] = "1ToF3hMm2VA6KDOeCYlfpYX9EZhWZaCs";
                    strArr3[1] = "Z30ky6DQTC9ucfzgiQKOMI68k5hVrHHu";
                    this.A01 = j;
                }
            }
            A62();
            return;
        }
        throw new RuntimeException();
    }

    private void A08(long j) {
        this.A05.postDelayed(this.A09, j);
    }

    private void A09(JSONObject jSONObject) throws JSONException {
        Map<String, String> shortEvnData = this.A06.A04().A5a();
        for (Map.Entry<String, String> entry : shortEvnData.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }

    public final void A0B() {
        JSONArray jSONArray;
        try {
            NetworkInfo activeNetwork = this.A04.getActiveNetworkInfo();
            if (activeNetwork == null || !activeNetwork.isConnectedOrConnecting()) {
                if (this.A06.A05().AAO()) {
                    Log.e(A0F, A03(240, 46, 39));
                }
                A08(this.A02);
                return;
            }
            this.A06.A05().AAO();
            JSONObject A5L = this.A07.A5L();
            if (A5L == null) {
                this.A06.A05().AAO();
                A05();
                return;
            }
            boolean AAO = this.A06.A05().AAO();
            String A03 = A03(309, 6, 43);
            if (AAO && A5L.has(A03)) {
                for (int i = 0; i < A5L.getJSONArray(A03).length(); i++) {
                    String str = A03(4, 19, 81) + i + A03(0, 3, 14) + jSONArray.get(i);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(286, 7, 102), String.valueOf(this.A00));
            A09(jSONObject);
            A5L.put(A03(305, 4, 9), jSONObject);
            C1638g9 c1638g9 = new C1638g9();
            c1638g9.put(A03(315, 7, 6), A5L.toString());
            InterfaceC1623fu AGx = this.A08.AGx(this.A06.A05().A86(), c1638g9.A08());
            String A73 = AGx != null ? AGx.A73() : null;
            if (!TextUtils.isEmpty(A73) && AGx != null) {
                if (AGx.A9C() != 200) {
                    if (this.A06.A05().AAO()) {
                        String responseBody = A0F;
                        Log.e(responseBody, A03(138, 48, 30) + AGx.A9C() + A03(3, 1, 55));
                    }
                    if (AGx.A9C() == 413 && C1123Up.A2Y(this.A06)) {
                        this.A07.AFZ();
                        A05();
                        return;
                    }
                    if (A5L.has(A03)) {
                        this.A07.ADe(A5L.getJSONArray(A03));
                    }
                    A06();
                    return;
                } else if (!this.A07.ADf(new JSONArray(A73))) {
                    if (this.A06.A05().AAO()) {
                        Log.w(A0F, A03(C10997yd1.Q1, 54, 88));
                    }
                    A06();
                    return;
                } else if (this.A07.AAb()) {
                    if (this.A06.A05().AAO()) {
                        Log.i(A0F, A03(58, 55, 87));
                    }
                    A06();
                    return;
                } else {
                    A05();
                    return;
                }
            }
            if (this.A06.A05().AAO()) {
                Log.e(A0F, A03(113, 25, 71));
            }
            if (C1123Up.A2N(this.A06) && A5L.has(A03)) {
                this.A07.ADe(A5L.getJSONArray(A03));
            }
            A06();
        } catch (Exception e) {
            C1669ge c1669ge = this.A06;
            String[] strArr = A0E;
            if (strArr[0].charAt(26) != strArr[1].charAt(26)) {
                Exception e2 = new RuntimeException();
                throw e2;
            }
            String[] strArr2 = A0E;
            strArr2[5] = "juVm3rSGrTKw83uGBob9EWWg86xlgGIp";
            strArr2[6] = "uyuZsDIDSXItwx867Sl9CxjwWd0LLO11";
            if (c1669ge.A05().AAO()) {
                Log.e(A0F, A03(23, 35, 72), e);
            }
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.V9
    public final void A61() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.V9
    public final void A62() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}
