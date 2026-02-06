package o;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* renamed from: o.o32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8420o32 {

    /* renamed from: o.o32$a */
    /* loaded from: classes.dex */
    public static final class a implements YD1 {
        public final /* synthetic */ float[] a;
        public final /* synthetic */ Matrix b;

        public a(float[] fArr, Matrix matrix) {
            this.a = fArr;
            this.b = matrix;
        }

        @Override // o.YD1
        public final long a(float f, float f2) {
            float[] fArr = this.a;
            fArr[0] = f;
            fArr[1] = f2;
            this.b.mapPoints(fArr);
            float[] fArr2 = this.a;
            return C7638kv0.d(fArr2[0], fArr2[1]);
        }
    }

    public static final void a(Path path, List<? extends C6302fS> list) {
        path.rewind();
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C6302fS c6302fS = list.get(i);
            if (z) {
                path.moveTo(c6302fS.f(), c6302fS.g());
                z = false;
            }
            path.cubicTo(c6302fS.j(), c6302fS.k(), c6302fS.l(), c6302fS.m(), c6302fS.h(), c6302fS.i());
        }
        path.close();
    }

    public static final Path b(C3841Ok1 c3841Ok1, float f, Path path) {
        C6562gT0.p(c3841Ok1, "<this>");
        C6562gT0.p(path, "path");
        a(path, c3841Ok1.a(f));
        return path;
    }

    public static final Path c(C8774pV1 c8774pV1) {
        C6562gT0.p(c8774pV1, "<this>");
        return f(c8774pV1, null, 1, null);
    }

    public static final Path d(C8774pV1 c8774pV1, Path path) {
        C6562gT0.p(c8774pV1, "<this>");
        C6562gT0.p(path, "path");
        a(path, c8774pV1.i());
        return path;
    }

    public static /* synthetic */ Path e(C3841Ok1 c3841Ok1, float f, Path path, int i, Object obj) {
        if ((i & 2) != 0) {
            path = new Path();
        }
        return b(c3841Ok1, f, path);
    }

    public static /* synthetic */ Path f(C8774pV1 c8774pV1, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = new Path();
        }
        return d(c8774pV1, path);
    }

    public static final C8774pV1 g(C8774pV1 c8774pV1, Matrix matrix) {
        C6562gT0.p(c8774pV1, "<this>");
        C6562gT0.p(matrix, "matrix");
        return c8774pV1.l(new a(new float[2], matrix));
    }
}
