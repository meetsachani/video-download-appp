package o;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import o.C2598Bv;
import o.C3679Mt;
import o.C9240rO2;
import o.InterfaceC9367rw;

/* renamed from: o.e9  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5983e9 implements C9240rO2.b {
    public static final float f = 1.0f;
    public final C7641kw a;
    public final Range<Float> b;
    public C3679Mt.a<Void> d;
    public float c = 1.0f;
    public float e = 1.0f;

    public C5983e9(C7641kw c7641kw) {
        CameraCharacteristics.Key key;
        this.a = c7641kw;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.b = (Range) c7641kw.a(key);
    }

    @Override // o.C9240rO2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        Float f2;
        if (this.d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f2 = null;
            } else {
                f2 = (Float) request.get(C5498c9.a());
            }
            if (f2 != null) {
                if (this.e == f2.floatValue()) {
                    this.d.c(null);
                    this.d = null;
                }
            }
        }
    }

    @Override // o.C9240rO2.b
    public float b() {
        return this.b.getLower().floatValue();
    }

    @Override // o.C9240rO2.b
    public void c() {
        this.c = 1.0f;
        C3679Mt.a<Void> aVar = this.d;
        if (aVar != null) {
            aVar.f(new InterfaceC9367rw.a("Camera is not active."));
            this.d = null;
        }
    }

    @Override // o.C9240rO2.b
    public float d() {
        return this.b.getUpper().floatValue();
    }

    @Override // o.C9240rO2.b
    public Rect e() {
        return (Rect) C10907yF1.l((Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // o.C9240rO2.b
    public void f(C2598Bv.a aVar) {
        aVar.g(C5498c9.a(), Float.valueOf(this.c));
    }

    @Override // o.C9240rO2.b
    public void g(float f2, C3679Mt.a<Void> aVar) {
        this.c = f2;
        C3679Mt.a<Void> aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC9367rw.a("There is a new zoomRatio being set"));
        }
        this.e = this.c;
        this.d = aVar;
    }
}
