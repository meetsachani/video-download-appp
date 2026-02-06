package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.f;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: o.Cj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2649Cj extends AbstractC2464Al2 {
    public final Executor b;
    public final f.j c;
    public final f.k d;
    public final f.l e;
    public final Rect f;
    public final Matrix g;
    public final int h;
    public final int i;
    public final int j;
    public final List<AbstractC3393Jv> k;

    public C2649Cj(Executor executor, f.j jVar, f.k kVar, f.l lVar, Rect rect, Matrix matrix, int i, int i2, int i3, List<AbstractC3393Jv> list) {
        if (executor != null) {
            this.b = executor;
            this.c = jVar;
            this.d = kVar;
            this.e = lVar;
            if (rect != null) {
                this.f = rect;
                if (matrix != null) {
                    this.g = matrix;
                    this.h = i;
                    this.i = i2;
                    this.j = i3;
                    if (list != null) {
                        this.k = list;
                        return;
                    }
                    throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
                }
                throw new NullPointerException("Null sensorToBufferTransform");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null appExecutor");
    }

    @Override // o.AbstractC2464Al2
    public Executor e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        f.j jVar;
        f.k kVar;
        f.l lVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2464Al2) {
            AbstractC2464Al2 abstractC2464Al2 = (AbstractC2464Al2) obj;
            if (this.b.equals(abstractC2464Al2.e()) && ((jVar = this.c) != null ? jVar.equals(abstractC2464Al2.h()) : abstractC2464Al2.h() == null) && ((kVar = this.d) != null ? kVar.equals(abstractC2464Al2.j()) : abstractC2464Al2.j() == null) && ((lVar = this.e) != null ? lVar.equals(abstractC2464Al2.k()) : abstractC2464Al2.k() == null) && this.f.equals(abstractC2464Al2.g()) && this.g.equals(abstractC2464Al2.n()) && this.h == abstractC2464Al2.m() && this.i == abstractC2464Al2.i() && this.j == abstractC2464Al2.f() && this.k.equals(abstractC2464Al2.o())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC2464Al2
    public int f() {
        return this.j;
    }

    @Override // o.AbstractC2464Al2
    public Rect g() {
        return this.f;
    }

    @Override // o.AbstractC2464Al2
    public f.j h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.b.hashCode() ^ 1000003) * 1000003;
        f.j jVar = this.c;
        int i = 0;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode) * 1000003;
        f.k kVar = this.d;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        f.l lVar = this.e;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return ((((((((((((i3 ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode();
    }

    @Override // o.AbstractC2464Al2
    public int i() {
        return this.i;
    }

    @Override // o.AbstractC2464Al2
    public f.k j() {
        return this.d;
    }

    @Override // o.AbstractC2464Al2
    public f.l k() {
        return this.e;
    }

    @Override // o.AbstractC2464Al2
    public int m() {
        return this.h;
    }

    @Override // o.AbstractC2464Al2
    public Matrix n() {
        return this.g;
    }

    @Override // o.AbstractC2464Al2
    public List<AbstractC3393Jv> o() {
        return this.k;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.b + ", inMemoryCallback=" + this.c + ", onDiskCallback=" + this.d + ", outputFileOptions=" + this.e + ", cropRect=" + this.f + ", sensorToBufferTransform=" + this.g + ", rotationDegrees=" + this.h + ", jpegQuality=" + this.i + ", captureMode=" + this.j + ", sessionConfigCameraCaptureCallbacks=" + this.k + "}";
    }
}
