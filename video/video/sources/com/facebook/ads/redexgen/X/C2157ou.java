package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C4731Xo;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.ou  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2157ou implements InterfaceC05537t {
    public static byte[] A05;
    public EP A00;
    public final int A01;
    public final long A02;
    public final Context A03;
    public final A6 A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-77, -44, -43, -48, -28, -37, -29, C2638Cg0.p7, -44, -35, -45, -44, C2638Cg0.C7, -44, C2638Cg0.C7, -30, -75, -48, -46, -29, -34, C2638Cg0.C7, -24, -95, C2638Cg0.z7, C2638Cg0.z7, C2638Cg0.x7, C2638Cg0.z7, 124, C2638Cg0.s7, C2638Cg0.w7, C2638Cg0.A7, -48, -67, C2638Cg0.w7, -48, C2638Cg0.s7, -67, -48, C2638Cg0.s7, C2638Cg0.w7, C2638Cg0.r7, 124, -94, -94, C2638Cg0.v7, -52, C2638Cg0.p7, C2638Cg0.r7, 124, C2638Cg0.p7, -44, -48, C2638Cg0.p7, C2638Cg0.w7, C2638Cg0.A7, C2638Cg0.s7, C2638Cg0.x7, C2638Cg0.w7, -70, -25, -25, -28, -25, -107, -34, -29, -24, -23, -42, -29, -23, -34, -42, -23, -34, -29, -36, -107, -69, C2638Cg0.p7, -74, -72, -107, C2638Cg0.B7, -19, -23, C2638Cg0.B7, -29, -24, -34, -28, -29, -12, C3307Iz.V, C3307Iz.V, C8077mf.H, C3307Iz.V, C2638Cg0.A7, C8077mf.B, C8077mf.G, 34, 35, C8077mf.r, C8077mf.G, 35, C8077mf.B, C8077mf.r, 35, C8077mf.B, C8077mf.G, C8077mf.z, C2638Cg0.A7, -2, 31, 36, 34, C2638Cg0.A7, C8077mf.x, C3307Iz.Z, 35, C8077mf.x, C8077mf.G, 34, C8077mf.B, C8077mf.H, C8077mf.G, 6, 51, 51, 48, 51, C2638Cg0.C7, 42, 47, 52, 53, 34, 47, 53, 42, 34, 53, 42, 47, 40, C2638Cg0.C7, C8077mf.A, 17, -6, C2638Cg0.C7, C3307Iz.Y, 57, 53, C3307Iz.Y, 47, 52, 42, 48, 47, C8077mf.r, 51, C3307Iz.X, 40, C3307Iz.a0, 40, -28, 10, 42, 49, 52, C3307Iz.a0, C3307Iz.c0, 5, 57, 40, C3307Iz.e0, 51, C8077mf.z, C3307Iz.a0, 50, 40, C3307Iz.a0, 54, C3307Iz.a0, 54, -14, C8077mf.p, 49, 35, C3307Iz.Y, C3307Iz.Z, C3307Iz.Y, -30, C8077mf.p, C3307Iz.c0, 36, 40, C3307Iz.f0, 35, C3307Iz.X, 3, 55, C3307Iz.Y, C3307Iz.c0, 49, C8077mf.x, C3307Iz.Z, 48, C3307Iz.Y, C3307Iz.Z, 52, C3307Iz.Z, 52, -16, 6, C3307Iz.a0, C8077mf.E, C8077mf.H, 31, C8077mf.H, C2638Cg0.B7, 6, 35, 28, C3307Iz.a0, 42, 47, C3307Iz.e0, -5, 47, C8077mf.H, 35, C3307Iz.a0, C8077mf.n, 31, 40, C8077mf.H, 31, C3307Iz.d0, 31, C3307Iz.d0, -24, 4, C3307Iz.Z, C8077mf.C, 28, C8077mf.G, 28, C2638Cg0.n7, 4, C3307Iz.V, C8077mf.D, C3307Iz.f0, 40, 48, C8077mf.p, C3307Iz.V, 28, C8077mf.G, C3307Iz.Z, 10, C8077mf.G, C3307Iz.Y, 28, C8077mf.G, 42, C8077mf.G, 42, -26, -7, 5, 3, -60, -4, -9, -7, -5, -8, 5, 5, 1, -60, -9, -6, 9, -60, -9, 4, -6, 8, 5, -1, -6, C8077mf.p, -60, 3, -5, -6, -1, -9, C2638Cg0.v7, -60, -5, C8077mf.p, 5, 6, 2, -9, C8077mf.q, -5, 8, -60, -5, C8077mf.p, 10, -60, -4, -4, 3, 6, -5, -3, -60, -36, -4, 3, 6, -5, -3, -41, C8077mf.m, -6, -1, 5, -24, -5, 4, -6, -5, 8, -5, 8, C8077mf.E, C3307Iz.Z, C3307Iz.X, -26, C8077mf.H, C8077mf.C, C8077mf.E, C8077mf.G, C8077mf.D, C3307Iz.Z, C3307Iz.Z, 35, -26, C8077mf.C, 28, C3307Iz.c0, -26, C8077mf.C, C3307Iz.Y, 28, 42, C3307Iz.Z, C3307Iz.V, 28, 48, -26, C3307Iz.X, C8077mf.G, 28, C3307Iz.V, C8077mf.C, -21, -26, C8077mf.G, 48, C3307Iz.Z, 40, 36, C8077mf.C, 49, C8077mf.G, 42, -26, C8077mf.G, 48, C3307Iz.d0, -26, C8077mf.H, 36, C8077mf.C, C8077mf.E, -26, 4, C3307Iz.V, C8077mf.D, C8077mf.H, 36, C8077mf.C, C8077mf.E, -7, C3307Iz.e0, 28, C3307Iz.V, C3307Iz.Z, 10, C8077mf.G, C3307Iz.Y, 28, C8077mf.G, 42, C8077mf.G, 42, -56, -44, -46, -109, C2638Cg0.x7, C2638Cg0.t7, -56, C2638Cg0.w7, C2638Cg0.u7, -44, -44, -48, -109, C2638Cg0.t7, C2638Cg0.v7, C2638Cg0.n7, -109, C2638Cg0.t7, -45, C2638Cg0.v7, -41, -44, C2638Cg0.z7, C2638Cg0.v7, -35, -109, -46, C2638Cg0.w7, C2638Cg0.v7, C2638Cg0.z7, C2638Cg0.t7, -104, -109, C2638Cg0.w7, -35, -44, -43, -47, C2638Cg0.t7, -34, C2638Cg0.w7, -41, -109, C2638Cg0.w7, -35, C2638Cg0.E7, -109, -44, -43, C2638Cg0.B7, C2638Cg0.n7, -109, -79, C2638Cg0.z7, C2638Cg0.u7, -44, -43, C2638Cg0.B7, C2638Cg0.n7, -90, C2638Cg0.B7, C2638Cg0.v7, C2638Cg0.z7, -44, -73, C2638Cg0.w7, -45, C2638Cg0.v7, C2638Cg0.w7, -41, C2638Cg0.w7, -41, 35, 47, C3307Iz.e0, -18, C3307Iz.Y, C3307Iz.V, 35, C3307Iz.X, 34, 47, 47, C3307Iz.c0, -18, C3307Iz.V, 36, 51, -18, C3307Iz.V, C3307Iz.f0, 36, 50, 47, C3307Iz.a0, 36, 56, -18, C3307Iz.e0, C3307Iz.X, 36, C3307Iz.a0, C3307Iz.V, -13, -18, C3307Iz.X, 56, 47, 48, C3307Iz.d0, C3307Iz.V, 57, C3307Iz.X, 50, -18, C3307Iz.X, 56, 52, -18, 54, 48, -7, -18, C8077mf.n, C3307Iz.a0, 34, 54, 48, 56, C8077mf.z, C3307Iz.a0, 36, C3307Iz.X, 47, C8077mf.u, C3307Iz.X, C3307Iz.f0, 36, C3307Iz.X, 50, C3307Iz.X, 50};
    }

    public C2157ou(Context context) {
        this(context, 0);
    }

    public C2157ou(Context context, int i) {
        this(context, null, i, 5000L);
    }

    @Deprecated
    public C2157ou(Context context, A6 a6, int i, long j) {
        this.A00 = new C2158ov(this);
        this.A03 = context;
        this.A01 = i;
        this.A02 = j;
        this.A04 = a6;
    }

    private final void A02(Context context, A6 a6, long j, Handler handler, GQ gq, int extensionRendererIndex, ArrayList<InterfaceC2151oo> arrayList) {
        arrayList.add(new AnonymousClass10(context, C1836jQ.A0T, new C1833jN(null, false), BT.A00, j, a6, false, false, handler, gq, 50, 5, 0, 0, 0));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(487, 70, 110));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (InterfaceC2151oo) cls.getConstructor(clazz, clazz2, Handler.class, GQ.class, clazz3, clazz3).newInstance(true, Long.valueOf(j), handler, gq, 50, 5));
                    Log.i(A00(0, 23, 29), A00(243, 27, 102));
                } catch (Exception e) {
                    e = e;
                    throw new RuntimeException(A00(127, 33, 111), e);
                }
            } catch (ClassNotFoundException unused) {
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(1:7)|8|(2:9|10)|(2:11|12)|14|15|17|18|(5:19|20|22|23|24)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00da, code lost:
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dc, code lost:
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
        throw new java.lang.RuntimeException(A00(59, 34, 35), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ed, code lost:
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
        r6 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A03(Context context, A6 a6, InterfaceC04403k[] interfaceC04403kArr, Handler handler, InterfaceC05748p interfaceC05748p, int extensionRendererIndex, ArrayList<InterfaceC2151oo> arrayList) {
        int extensionRendererIndex2;
        int extensionRendererIndex3;
        String A00 = A00(0, 23, 29);
        arrayList.add(new AnonymousClass12(context, C1836jQ.A0T, new C1833jN(null, false), BT.A00, a6, false, false, false, handler, interfaceC05748p, C8R.A02(context), interfaceC04403kArr));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            extensionRendererIndex2 = size + 1;
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            e = e;
        }
        try {
            arrayList.add(size, (InterfaceC2151oo) Class.forName(A00(415, 72, 19)).getConstructor(Handler.class, InterfaceC05748p.class, InterfaceC04403k[].class).newInstance(handler, interfaceC05748p, interfaceC04403kArr));
            Log.i(A00, A00(C10997yd1.z1, 28, 104));
        } catch (ClassNotFoundException unused2) {
            size = extensionRendererIndex2;
            extensionRendererIndex2 = size;
            Constructor<?> constructor = Class.forName(A00(343, 72, 102)).getConstructor(Handler.class, InterfaceC05748p.class, InterfaceC04403k[].class);
            extensionRendererIndex3 = extensionRendererIndex2 + 1;
            arrayList.add(extensionRendererIndex2, (InterfaceC2151oo) constructor.newInstance(handler, interfaceC05748p, interfaceC04403kArr));
            Log.i(A00, A00(C10997yd1.l2, 28, 112));
            try {
                Constructor<?> constructor2 = Class.forName(A00(C4731Xo.d1, 73, 68)).getConstructor(Handler.class, InterfaceC05748p.class, InterfaceC04403k[].class);
                try {
                    arrayList.add(extensionRendererIndex3, (InterfaceC2151oo) constructor2.newInstance(handler, interfaceC05748p, interfaceC04403kArr));
                    Log.i(A00, A00(160, 27, 114));
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException(A00(23, 36, 10), e);
                }
            } catch (ClassNotFoundException unused3) {
                return;
            }
        } catch (Exception e3) {
            e = e3;
            throw new RuntimeException(A00(93, 34, 93), e);
        }
        Constructor<?> constructor3 = Class.forName(A00(343, 72, 102)).getConstructor(Handler.class, InterfaceC05748p.class, InterfaceC04403k[].class);
        extensionRendererIndex3 = extensionRendererIndex2 + 1;
        arrayList.add(extensionRendererIndex2, (InterfaceC2151oo) constructor3.newInstance(handler, interfaceC05748p, interfaceC04403kArr));
        Log.i(A00, A00(C10997yd1.l2, 28, 112));
        try {
            Constructor<?> constructor22 = Class.forName(A00(C4731Xo.d1, 73, 68)).getConstructor(Handler.class, InterfaceC05748p.class, InterfaceC04403k[].class);
            arrayList.add(extensionRendererIndex3, (InterfaceC2151oo) constructor22.newInstance(handler, interfaceC05748p, interfaceC04403kArr));
            Log.i(A00, A00(160, 27, 114));
        } catch (Exception e4) {
            e = e4;
        }
    }

    private final void A04(Context context, InterfaceC0629Bf interfaceC0629Bf, Looper looper, int i, ArrayList<InterfaceC2151oo> arrayList) {
        arrayList.add(new C03871f(interfaceC0629Bf, looper));
    }

    private final void A05(Context context, ES es, Looper looper, int i, ArrayList<InterfaceC2151oo> arrayList) {
        arrayList.add(new C03831b(es, looper, this.A00));
    }

    private final InterfaceC04403k[] A06() {
        return new InterfaceC04403k[0];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05537t
    public final InterfaceC2151oo[] A5Y(Handler handler, GQ gq, InterfaceC05748p interfaceC05748p, ES es, InterfaceC0629Bf interfaceC0629Bf, A6 a6) {
        A6 a62 = a6;
        if (a62 == null) {
            a62 = this.A04;
        }
        ArrayList<InterfaceC2151oo> arrayList = new ArrayList<>();
        A02(this.A03, a62, this.A02, handler, gq, this.A01, arrayList);
        A03(this.A03, a62, A06(), handler, interfaceC05748p, this.A01, arrayList);
        A05(this.A03, es, handler.getLooper(), this.A01, arrayList);
        A04(this.A03, interfaceC0629Bf, handler.getLooper(), this.A01, arrayList);
        return (InterfaceC2151oo[]) arrayList.toArray(new InterfaceC2151oo[arrayList.size()]);
    }
}
