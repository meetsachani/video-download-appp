package o;

import o.UK;

/* renamed from: o.Qv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4077Qv1 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 16;
    public static final int g = 32;
    public static final int h = 64;
    public static final int i = 128;
    public static final int j = 256;
    public static final int k = 512;
    public static final int l = 1024;
    public static final int m = 257;
    public static boolean[] n = new boolean[3];

    /* renamed from: o  reason: collision with root package name */
    public static final int f592o = 0;
    public static final int p = 1;
    public static final int q = 2;

    public static void a(VK vk, C9872u01 c9872u01, UK uk) {
        uk.t = -1;
        uk.u = -1;
        UK.b bVar = vk.b0[0];
        UK.b bVar2 = UK.b.WRAP_CONTENT;
        if (bVar != bVar2 && uk.b0[0] == UK.b.MATCH_PARENT) {
            int i2 = uk.Q.g;
            int m0 = vk.m0() - uk.S.g;
            MK mk = uk.Q;
            mk.i = c9872u01.s(mk);
            MK mk2 = uk.S;
            mk2.i = c9872u01.s(mk2);
            c9872u01.f(uk.Q.i, i2);
            c9872u01.f(uk.S.i, m0);
            uk.t = 2;
            uk.D1(i2, m0);
        }
        if (vk.b0[1] != bVar2 && uk.b0[1] == UK.b.MATCH_PARENT) {
            int i3 = uk.R.g;
            int D = vk.D() - uk.T.g;
            MK mk3 = uk.R;
            mk3.i = c9872u01.s(mk3);
            MK mk4 = uk.T;
            mk4.i = c9872u01.s(mk4);
            c9872u01.f(uk.R.i, i3);
            c9872u01.f(uk.T.i, D);
            if (uk.n0 > 0 || uk.l0() == 8) {
                MK mk5 = uk.U;
                mk5.i = c9872u01.s(mk5);
                c9872u01.f(uk.U.i, uk.n0 + i3);
            }
            uk.u = 2;
            uk.Y1(i3, D);
        }
    }

    public static final boolean b(int i2, int i3) {
        if ((i2 & i3) == i3) {
            return true;
        }
        return false;
    }
}
