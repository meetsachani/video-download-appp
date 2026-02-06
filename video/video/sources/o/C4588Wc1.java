package o;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C8774pV1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Wc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4588Wc1 {
    public static final XP a = new XP(0.15f, 0.0f);
    public static final XP b = new XP(0.2f, 0.0f);
    public static final XP c = new XP(0.3f, 0.0f);
    public static final XP d = new XP(0.5f, 0.0f);
    public static final XP e = new XP(1.0f, 0.0f);
    public static final C8774pV1 f = R(k(), true);
    public static final C8774pV1 g = R(M(), true);
    public static final C8774pV1 h = R(J(), true);
    public static final C8774pV1 i = R(f(), true);
    public static final C8774pV1 j = R(u(), true);
    public static final C8774pV1 k = R(g(), true);
    public static final C8774pV1 l = R(I(), true);
    public static final C8774pV1 m = R(B(-45.0f), true);
    public static final C8774pV1 n = R(D(), true);

    /* renamed from: o  reason: collision with root package name */
    public static final C8774pV1 f656o = R(P(-90.0f), true);
    public static final C8774pV1 p = R(t(), true);
    public static final C8774pV1 q = R(l(), true);
    public static final C8774pV1 r = R(C(), true);
    public static final C8774pV1 s = R(x(-90.0f), true);
    public static final C8774pV1 t = R(N(), true);
    public static final C8774pV1 u = R(Q(), true);
    public static final C8774pV1 v = R(p(), true);
    public static final C8774pV1 w = R(q(), true);
    public static final C8774pV1 x = R(r(), true);
    public static final C8774pV1 y = R(s(), true);
    public static final C8774pV1 z = R(o(), true);
    public static final C8774pV1 A = R(y(), true);
    public static final C8774pV1 B = R(m(), true);
    public static final C8774pV1 C = R(n(), true);
    public static final C8774pV1 D = R(j(), true);
    public static final C8774pV1 E = R(L(), true);
    public static final C8774pV1 F = R(h(), true);
    public static final C8774pV1 G = R(K(), true);
    public static final C8774pV1 H = R(v(), true);
    public static final C8774pV1 I = R(G(), true);
    public static final C8774pV1 J = R(H(), true);
    public static final C8774pV1 K = R(E(), true);
    public static final C8774pV1 L = R(F(), true);
    public static final C8774pV1 M = R(i(), true);
    public static final C8774pV1 N = R(z(), true);

    @InterfaceC5670cr1
    public static C8774pV1 A() {
        return C8420o32.g(C8177n32.a(C8774pV1.e), b(1.0f, 0.64f));
    }

    @InterfaceC5670cr1
    public static C8774pV1 B(float f2) {
        return C8420o32.g(A(), a(f2));
    }

    @InterfaceC5670cr1
    public static C8774pV1 C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, -0.009f), new XP(0.172f, 0.0f)));
        return e(arrayList, 5, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 D() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.961f, 0.039f), new XP(0.426f, 0.0f)));
        arrayList.add(new b(new PointF(1.001f, 0.428f)));
        arrayList.add(new b(new PointF(1.0f, 0.609f), e));
        return e(arrayList, 2, 0.5f, 0.5f, true);
    }

    @InterfaceC5670cr1
    public static C8774pV1 E() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.0f)));
        arrayList.add(new b(new PointF(0.704f, 0.0f)));
        arrayList.add(new b(new PointF(0.704f, 0.065f)));
        arrayList.add(new b(new PointF(0.843f, 0.065f)));
        arrayList.add(new b(new PointF(0.843f, 0.148f)));
        arrayList.add(new b(new PointF(0.926f, 0.148f)));
        arrayList.add(new b(new PointF(0.926f, 0.296f)));
        arrayList.add(new b(new PointF(1.0f, 0.296f)));
        return e(arrayList, 2, 0.5f, 0.5f, true);
    }

    @InterfaceC5670cr1
    public static C8774pV1 F() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.11f, 0.5f)));
        arrayList.add(new b(new PointF(0.113f, 0.0f)));
        arrayList.add(new b(new PointF(0.287f, 0.0f)));
        arrayList.add(new b(new PointF(0.287f, 0.087f)));
        arrayList.add(new b(new PointF(0.421f, 0.087f)));
        arrayList.add(new b(new PointF(0.421f, 0.17f)));
        arrayList.add(new b(new PointF(0.56f, 0.17f)));
        arrayList.add(new b(new PointF(0.56f, 0.265f)));
        arrayList.add(new b(new PointF(0.674f, 0.265f)));
        arrayList.add(new b(new PointF(0.675f, 0.344f)));
        arrayList.add(new b(new PointF(0.789f, 0.344f)));
        arrayList.add(new b(new PointF(0.789f, 0.439f)));
        arrayList.add(new b(new PointF(0.888f, 0.439f)));
        return e(arrayList, 1, 0.5f, 0.5f, true);
    }

    @InterfaceC5670cr1
    public static C8774pV1 G() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.053f)));
        arrayList.add(new b(new PointF(0.545f, -0.04f), new XP(0.405f, 0.0f)));
        arrayList.add(new b(new PointF(0.67f, -0.035f), new XP(0.426f, 0.0f)));
        arrayList.add(new b(new PointF(0.717f, 0.066f), new XP(0.574f, 0.0f)));
        arrayList.add(new b(new PointF(0.722f, 0.128f)));
        arrayList.add(new b(new PointF(0.777f, 0.002f), new XP(0.36f, 0.0f)));
        arrayList.add(new b(new PointF(0.914f, 0.149f), new XP(0.66f, 0.0f)));
        arrayList.add(new b(new PointF(0.926f, 0.289f), new XP(0.66f, 0.0f)));
        arrayList.add(new b(new PointF(0.881f, 0.346f)));
        arrayList.add(new b(new PointF(0.94f, 0.344f), new XP(0.126f, 0.0f)));
        arrayList.add(new b(new PointF(1.003f, 0.437f), new XP(0.255f, 0.0f)));
        return C8420o32.g(e(arrayList, 2, 0.5f, 0.5f, true), b(1.0f, 0.742f));
    }

    @InterfaceC5670cr1
    public static C8774pV1 H() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.87f, 0.13f), new XP(0.146f, 0.0f)));
        arrayList.add(new b(new PointF(0.818f, 0.357f)));
        arrayList.add(new b(new PointF(1.0f, 0.332f), new XP(0.853f, 0.0f)));
        return e(arrayList, 4, 0.5f, 0.5f, true);
    }

    @InterfaceC5670cr1
    public static C8774pV1 I() {
        C8774pV1.a aVar = C8774pV1.e;
        XP xp = XP.d;
        XP xp2 = b;
        XP xp3 = e;
        return C8177n32.B(aVar, 1.6f, 1.0f, xp, Arrays.asList(xp2, xp2, xp3, xp3), 0.0f, 0.0f);
    }

    @InterfaceC5670cr1
    public static C8774pV1 J() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.926f, 0.97f), new XP(0.189f, 0.811f)));
        arrayList.add(new b(new PointF(-0.021f, 0.967f), new XP(0.187f, 0.057f)));
        return e(arrayList, 2, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 K() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.733f, 0.454f)));
        arrayList.add(new b(new PointF(0.839f, 0.437f), new XP(0.532f, 0.0f)));
        arrayList.add(new b(new PointF(0.949f, 0.449f), new XP(0.439f, 1.0f)));
        arrayList.add(new b(new PointF(0.998f, 0.478f), new XP(0.174f, 0.0f)));
        return e(arrayList, 16, 0.5f, 0.5f, true);
    }

    @InterfaceC5670cr1
    public static C8774pV1 L() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.193f, 0.277f), new XP(0.053f, 0.0f)));
        arrayList.add(new b(new PointF(0.176f, 0.055f), new XP(0.053f, 0.0f)));
        return e(arrayList, 10, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 M() {
        return C8177n32.B(C8774pV1.e, 1.0f, 1.0f, c, null, 0.0f, 0.0f);
    }

    @InterfaceC5670cr1
    public static C8774pV1 N() {
        return C8177n32.G(C8774pV1.e, 8, 1.0f, 0.8f, a);
    }

    @InterfaceC5670cr1
    public static C8774pV1 O() {
        return C9017qV1.e(3, 1.0f, 0.0f, 0.0f, b);
    }

    @InterfaceC5670cr1
    public static C8774pV1 P(float f2) {
        return C8420o32.g(O(), a(f2));
    }

    @InterfaceC5670cr1
    public static C8774pV1 Q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 1.08f), new XP(0.085f, 0.0f)));
        arrayList.add(new b(new PointF(0.358f, 0.843f), new XP(0.085f, 0.0f)));
        return e(arrayList, 8, 0.5f, 0.5f, false);
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public static C8774pV1 R(@InterfaceC5670cr1 C8774pV1 c8774pV1, boolean z2) {
        return S(c8774pV1, z2, new RectF(0.0f, 0.0f, 1.0f, 1.0f));
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public static C8774pV1 S(@InterfaceC5670cr1 C8774pV1 c8774pV1, boolean z2, @InterfaceC5670cr1 RectF rectF) {
        float[] fArr = new float[4];
        if (z2) {
            c8774pV1.e(fArr);
        } else {
            c8774pV1.b(fArr);
        }
        RectF rectF2 = new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
        float min = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        Matrix b2 = b(min, min);
        b2.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        b2.postTranslate(rectF.centerX(), rectF.centerY());
        return C8420o32.g(c8774pV1, b2);
    }

    public static void T(@InterfaceC5670cr1 List<b> list, @InterfaceC5670cr1 List<b> list2, int i2, float f2, float f3, boolean z2) {
        boolean z3;
        int i3;
        float f4;
        list2.clear();
        V(list, f2, f3);
        float f5 = (float) (6.283185307179586d / i2);
        if (z2) {
            int i4 = i2 * 2;
            float f6 = f5 / 2.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                for (int i6 = 0; i6 < list.size(); i6++) {
                    if (i5 % 2 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i3 = (list.size() - 1) - i6;
                    } else {
                        i3 = i6;
                    }
                    b bVar = list.get(i3);
                    if (i3 > 0 || !z3) {
                        float f7 = i5 * f6;
                        if (z3) {
                            f4 = (f6 - bVar.a.x) + (list.get(0).a.x * 2.0f);
                        } else {
                            f4 = bVar.a.x;
                        }
                        list2.add(new b(new PointF(f7 + f4, bVar.a.y), bVar.b));
                    }
                }
            }
        } else {
            for (int i7 = 0; i7 < i2; i7++) {
                for (b bVar2 : list) {
                    list2.add(new b(new PointF((i7 * f5) + bVar2.a.x, bVar2.a.y), bVar2.b));
                }
            }
        }
        U(list2, f2, f3);
    }

    public static void U(@InterfaceC5670cr1 List<b> list, float f2, float f3) {
        for (b bVar : list) {
            bVar.e(f2, f3);
        }
    }

    public static void V(@InterfaceC5670cr1 List<b> list, float f2, float f3) {
        for (b bVar : list) {
            bVar.f(f2, f3);
        }
    }

    @InterfaceC5670cr1
    public static List<XP> W(@InterfaceC5670cr1 List<b> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(list.get(i2).b);
        }
        return arrayList;
    }

    @InterfaceC5670cr1
    public static float[] X(@InterfaceC5670cr1 List<b> list) {
        float[] fArr = new float[list.size() * 2];
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = i2 * 2;
            fArr[i3] = list.get(i2).a.x;
            fArr[i3 + 1] = list.get(i2).a.y;
        }
        return fArr;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public static Matrix a(float f2) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f2);
        return matrix;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public static Matrix b(float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setScale(f2, f3);
        return matrix;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public static ShapeDrawable c(@InterfaceC5670cr1 C8774pV1 c8774pV1) {
        return new ShapeDrawable(new PathShape(C8420o32.c(c8774pV1), 1.0f, 1.0f));
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public static Matrix d(float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setSkew(f2, f3);
        return matrix;
    }

    @InterfaceC5670cr1
    public static C8774pV1 e(@InterfaceC5670cr1 List<b> list, int i2, float f2, float f3, boolean z2) {
        ArrayList arrayList = new ArrayList();
        T(list, arrayList, i2, f2, f3, z2);
        return C9017qV1.l(X(arrayList), XP.d, W(arrayList), f2, f3);
    }

    @InterfaceC5670cr1
    public static C8774pV1 f() {
        XP xp = XP.d;
        XP xp2 = e;
        XP xp3 = b;
        return C8420o32.g(C9017qV1.f(4, 1.0f, 0.0f, 0.0f, xp, Arrays.asList(xp2, xp2, xp3, xp3)), a(-135.0f));
    }

    @InterfaceC5670cr1
    public static C8774pV1 g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.892f), new XP(0.313f, 0.0f)));
        arrayList.add(new b(new PointF(-0.216f, 1.05f), new XP(0.207f, 0.0f)));
        arrayList.add(new b(new PointF(0.499f, -0.16f), new XP(0.215f, 1.0f)));
        arrayList.add(new b(new PointF(1.225f, 1.06f), new XP(0.211f, 0.0f)));
        return e(arrayList, 1, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.457f, 0.296f), new XP(0.007f, 0.0f)));
        arrayList.add(new b(new PointF(0.5f, -0.051f), new XP(0.007f, 0.0f)));
        return e(arrayList, 15, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.796f, 0.5f)));
        PointF pointF = new PointF(0.853f, 0.518f);
        XP xp = e;
        arrayList.add(new b(pointF, xp));
        arrayList.add(new b(new PointF(0.992f, 0.631f), xp));
        arrayList.add(new b(new PointF(0.968f, 1.0f), xp));
        return e(arrayList, 2, 0.5f, 0.5f, true);
    }

    @InterfaceC5670cr1
    public static C8774pV1 j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, -0.006f), new XP(0.006f, 0.0f)));
        arrayList.add(new b(new PointF(0.592f, 0.158f), new XP(0.006f, 0.0f)));
        return e(arrayList, 12, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 k() {
        return C8177n32.b(C8774pV1.e, 10);
    }

    @InterfaceC5670cr1
    public static C8774pV1 l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.171f, 0.841f), new XP(0.159f, 0.0f)));
        arrayList.add(new b(new PointF(-0.02f, 0.5f), new XP(0.14f, 0.0f)));
        arrayList.add(new b(new PointF(0.17f, 0.159f), new XP(0.159f, 0.0f)));
        return e(arrayList, 2, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.074f)));
        arrayList.add(new b(new PointF(0.725f, -0.099f), new XP(0.476f, 0.0f)));
        return e(arrayList, 4, 0.5f, 0.5f, true);
    }

    @InterfaceC5670cr1
    public static C8774pV1 n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.036f)));
        arrayList.add(new b(new PointF(0.758f, -0.101f), new XP(0.209f, 0.0f)));
        return e(arrayList, 8, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 o() {
        return C8420o32.g(C8177n32.G(C8774pV1.e, 12, 1.0f, 0.8f, d), a(-90.0f));
    }

    @InterfaceC5670cr1
    public static C8774pV1 p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(1.237f, 1.236f), new XP(0.258f, 0.0f)));
        arrayList.add(new b(new PointF(0.5f, 0.918f), new XP(0.233f, 0.0f)));
        return e(arrayList, 4, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.723f, 0.884f), new XP(0.394f, 0.0f)));
        arrayList.add(new b(new PointF(0.5f, 1.099f), new XP(0.398f, 0.0f)));
        return e(arrayList, 6, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 r() {
        return C8420o32.g(C8177n32.G(C8774pV1.e, 7, 1.0f, 0.75f, d), a(-90.0f));
    }

    @InterfaceC5670cr1
    public static C8774pV1 s() {
        return C8420o32.g(C8177n32.G(C8774pV1.e, 9, 1.0f, 0.8f, d), a(-90.0f));
    }

    @InterfaceC5670cr1
    public static C8774pV1 t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 1.096f), new XP(0.151f, 0.524f)));
        arrayList.add(new b(new PointF(0.04f, 0.5f), new XP(0.159f, 0.0f)));
        return e(arrayList, 2, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(1.0f, 1.0f), new XP(0.148f, 0.417f)));
        arrayList.add(new b(new PointF(0.0f, 1.0f), new XP(0.151f, 0.0f)));
        arrayList.add(new b(new PointF(0.0f, 0.0f), new XP(0.148f, 0.0f)));
        arrayList.add(new b(new PointF(0.978f, 0.02f), new XP(0.803f, 0.0f)));
        return e(arrayList, 1, 0.5f, 0.5f, false);
    }

    @InterfaceC5670cr1
    public static C8774pV1 v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.37f, 0.187f)));
        arrayList.add(new b(new PointF(0.416f, 0.049f), new XP(0.381f, 0.0f)));
        arrayList.add(new b(new PointF(0.479f, 0.0f), new XP(0.095f, 0.0f)));
        return e(arrayList, 8, 0.5f, 0.5f, true);
    }

    @InterfaceC5670cr1
    public static C8774pV1 w() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.499f, 1.023f), new XP(0.241f, 0.778f)));
        arrayList.add(new b(new PointF(-0.005f, 0.792f), new XP(0.208f, 0.0f)));
        arrayList.add(new b(new PointF(0.073f, 0.258f), new XP(0.228f, 0.0f)));
        arrayList.add(new b(new PointF(0.433f, -0.0f), new XP(0.491f, 0.0f)));
        return e(arrayList, 1, 0.5f, 0.5f, true);
    }

    @InterfaceC5670cr1
    public static C8774pV1 x(float f2) {
        return C8420o32.g(w(), a(f2));
    }

    @InterfaceC5670cr1
    public static C8774pV1 y() {
        ArrayList arrayList = new ArrayList();
        PointF pointF = new PointF(0.5f, 0.0f);
        XP xp = e;
        arrayList.add(new b(pointF, xp));
        arrayList.add(new b(new PointF(1.0f, 0.0f), xp));
        arrayList.add(new b(new PointF(1.0f, 1.14f), new XP(0.254f, 0.106f)));
        arrayList.add(new b(new PointF(0.575f, 0.906f), new XP(0.253f, 0.0f)));
        return e(arrayList, 1, 0.5f, 0.5f, true);
    }

    @InterfaceC5670cr1
    public static C8774pV1 z() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.268f), new XP(0.016f, 0.0f)));
        arrayList.add(new b(new PointF(0.792f, -0.066f), new XP(0.958f, 0.0f)));
        arrayList.add(new b(new PointF(1.064f, 0.276f), e));
        arrayList.add(new b(new PointF(0.501f, 0.946f), new XP(0.129f, 0.0f)));
        return e(arrayList, 1, 0.5f, 0.5f, true);
    }

    /* renamed from: o.Wc1$b */
    /* loaded from: classes3.dex */
    public static class b {
        public PointF a;
        public XP b;

        public final void e(float f, float f2) {
            PointF pointF = this.a;
            float cos = (float) ((pointF.y * Math.cos(pointF.x)) + f);
            PointF pointF2 = this.a;
            PointF pointF3 = this.a;
            pointF3.x = cos;
            pointF3.y = (float) ((pointF2.y * Math.sin(pointF2.x)) + f2);
        }

        public final void f(float f, float f2) {
            this.a.offset(-f, -f2);
            PointF pointF = this.a;
            PointF pointF2 = this.a;
            float hypot = (float) Math.hypot(pointF2.x, pointF2.y);
            PointF pointF3 = this.a;
            pointF3.x = (float) Math.atan2(pointF.y, pointF.x);
            pointF3.y = hypot;
        }

        public b(@InterfaceC5670cr1 PointF pointF) {
            this(pointF, XP.d);
        }

        public b(@InterfaceC5670cr1 PointF pointF, @InterfaceC5670cr1 XP xp) {
            this.a = pointF;
            this.b = xp;
        }
    }
}
