package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C4715Xk;
import o.C7193j50;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class CX {
    public static byte[] A07;
    public static String[] A08 = {"CYKD2nMMR2kwPobHu8vj2zaJDmBsbtuJ", "1T97HHMVTjXeNt4gEkhbfce0p1OpTQmk", "SUWpzIO8VifItPl53IwYK2GxvFHViABr", "RYVPvk", "LWuCRuFF1x0IzMhL3qP3Bi6UDYkfn6RT", "aSZX88VI8Agv5yyz6W8MmPiDkeOBfUV2", "yvrxvgzWs1HIxL", "zzJQ3nHJo9RAIXvSLHnZEz6WzVBAgkTr"};
    public int A00;
    public CS A01;
    public CW A02;
    public final Context A03;
    public final Handler A04 = C5C.A0Z();
    public final Requirements A05;
    public final CT A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{-24, -11, -21, -7, -10, -16, -21, -75, -16, -11, -5, -20, -11, -5, -75, -24, -22, -5, -16, -10, -11, -75, -56, C2638Cg0.w7, -37, -48, -42, -43, -26, -41, -42, -34, -52, C2638Cg0.E7, -26, C2638Cg0.w7, -42, -43, -43, -52, C2638Cg0.w7, -37, -52, C2638Cg0.x7, -44, C2638Cg0.C7, -41, -27, -30, -36, -41, -95, -36, C2638Cg0.C7, -25, C2638Cg0.n7, C2638Cg0.C7, -25, -95, -44, -42, -25, -36, -30, C2638Cg0.C7, -95, -76, -74, C2638Cg0.u7, -68, C2638Cg0.q7, C2638Cg0.p7, -46, C2638Cg0.r7, C2638Cg0.q7, C2638Cg0.w7, -72, C2638Cg0.s7, -46, -73, -68, C2638Cg0.t7, -74, C2638Cg0.q7, C2638Cg0.p7, C2638Cg0.p7, -72, -74, C2638Cg0.u7, -72, -73, 57, 70, 60, 74, 71, 65, 60, 6, 65, 70, 76, C4715Xk.i, 70, 76, 6, 57, 59, 76, 65, 71, 70, 6, 28, C8077mf.G, C3307Iz.f0, C3307Iz.V, C8077mf.E, C8077mf.G, 55, C3307Iz.c0, C3307Iz.d0, C3307Iz.Z, 42, C8077mf.C, 31, C8077mf.G, 55, 36, C3307Iz.Z, 47, -37, -24, -34, -20, -23, -29, -34, -88, -29, -24, -18, -33, -24, -18, -88, -37, -35, -18, -29, -23, -24, -88, -66, -65, -48, C2638Cg0.r7, -67, -65, C2638Cg0.E7, C2638Cg0.y7, C2638Cg0.z7, C2638Cg0.v7, -52, -69, C2638Cg0.p7, -65, C2638Cg0.E7, C2638Cg0.v7, C2638Cg0.s7, 35, 48, C3307Iz.Y, 52, 49, C3307Iz.c0, C3307Iz.Y, -16, C3307Iz.c0, 48, 54, C3307Iz.Z, 48, 54, -16, 35, C3307Iz.X, 54, C3307Iz.c0, 49, 48, -16, C8077mf.y, 5, C8077mf.x, 7, 7, C8077mf.r, C3307Iz.V, 17, 8, 8, -4, 9, -1, 13, 10, 4, -1, C2638Cg0.v7, 4, 9, C8077mf.q, 0, 9, C8077mf.q, C2638Cg0.v7, -4, -2, C8077mf.q, 4, 10, 9, C2638Cg0.v7, -18, -34, -19, -32, -32, -23, -6, -22, -23, C2638Cg0.B7, -25, -35, -21, -24, -30, -35, -89, -25, -34, -19, -89, -36, -24, -25, -25, -89, -68, -56, C2638Cg0.u7, C2638Cg0.u7, -66, -68, C2638Cg0.y7, C2638Cg0.q7, C2638Cg0.A7, C2638Cg0.q7, C2638Cg0.y7, -46, C2638Cg0.n7, -68, C2638Cg0.p7, -70, C2638Cg0.u7, C2638Cg0.o7, -66, 67, 80, 70, 84, 81, 75, 70, C8077mf.r, 81, 85, C8077mf.r, 67, 69, 86, 75, 81, 80, C8077mf.r, C3307Iz.Y, C3307Iz.Z, 56, C3307Iz.c0, C3307Iz.X, C3307Iz.Z, 65, C3307Iz.c0, C3307Iz.Y, C3307Iz.f0, C3307Iz.Z, 65, 47, 49, C3307Iz.Y, C3307Iz.Z, 65, C3307Iz.X, 42, 35, 48, C3307Iz.a0, C3307Iz.Z, C3307Iz.Y, -15, -3, -4, -4, -13, -15, 2, -9, 4, -9, 2, 7};
    }

    static {
        A06();
    }

    public CX(Context context, CT ct, Requirements requirements) {
        this.A03 = context.getApplicationContext();
        this.A06 = ct;
        this.A05 = requirements;
    }

    public void A03() {
        int A072 = this.A05.A07(this.A03);
        int notMetRequirements = this.A00;
        if (notMetRequirements != A072) {
            this.A00 = A072;
            this.A06.AFh(this, A072);
        }
    }

    public void A04() {
        if ((this.A00 & 3) == 0) {
            return;
        }
        A03();
    }

    private void A05() {
        this.A02 = new CW(this);
        ((ConnectivityManager) AbstractC04543y.A01((ConnectivityManager) this.A03.getSystemService(A02(311, 12, 37)))).registerDefaultNetworkCallback(this.A02);
    }

    public final int A09() {
        this.A00 = this.A05.A07(this.A03);
        IntentFilter intentFilter = new IntentFilter();
        if (this.A05.A0A()) {
            if (C5C.A02 >= 24) {
                A05();
            } else {
                intentFilter.addAction(A02(233, 36, 16));
            }
        }
        if (this.A05.A08()) {
            intentFilter.addAction(A02(0, 44, 30));
            intentFilter.addAction(A02(44, 47, 10));
        }
        if (this.A05.A09()) {
            if (C5C.A02 >= 23) {
                intentFilter.addAction(A02(269, 42, 121));
            } else {
                intentFilter.addAction(A02(202, 31, 50));
                String A02 = A02(C7193j50.f, 32, 89);
                if (A08[1].charAt(13) != 't') {
                    throw new RuntimeException();
                }
                A08[1] = "34fJRbWthZD6PtxUK55RQZaVQ6NgySS1";
                intentFilter.addAction(A02);
            }
        }
        if (this.A05.A0B()) {
            intentFilter.addAction(A02(91, 40, 111));
            intentFilter.addAction(A02(131, 39, 17));
        }
        this.A01 = new CS(this);
        this.A03.registerReceiver(this.A01, intentFilter, null, this.A04);
        return this.A00;
    }

    public final Requirements A0A() {
        return this.A05;
    }
}
