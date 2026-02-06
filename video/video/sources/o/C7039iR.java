package o;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import o.C2598Bv;
import o.C3679Mt;
import o.C9240rO2;
import o.InterfaceC9367rw;

/* renamed from: o.iR  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7039iR implements C9240rO2.b {
    public static final float e = 1.0f;
    public final C7641kw a;
    public C3679Mt.a<Void> c;
    public Rect b = null;
    public Rect d = null;

    public C7039iR(C7641kw c7641kw) {
        this.a = c7641kw;
    }

    public static Rect h(Rect rect, float f) {
        float width = rect.width() / f;
        float height = rect.height() / f;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    @Override // o.C9240rO2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        Rect rect;
        if (this.c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                rect = null;
            } else {
                rect = (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            }
            Rect rect2 = this.d;
            if (rect2 != null && rect2.equals(rect)) {
                this.c.c(null);
                this.c = null;
                this.d = null;
            }
        }
    }

    @Override // o.C9240rO2.b
    public float b() {
        return 1.0f;
    }

    @Override // o.C9240rO2.b
    public void c() {
        this.d = null;
        this.b = null;
        C3679Mt.a<Void> aVar = this.c;
        if (aVar != null) {
            aVar.f(new InterfaceC9367rw.a("Camera is not active."));
            this.c = null;
        }
    }

    @Override // o.C9240rO2.b
    public float d() {
        Float f = (Float) this.a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        if (f.floatValue() < b()) {
            return b();
        }
        return f.floatValue();
    }

    @Override // o.C9240rO2.b
    public Rect e() {
        Rect rect = this.b;
        if (rect != null) {
            return rect;
        }
        return i();
    }

    @Override // o.C9240rO2.b
    public void f(C2598Bv.a aVar) {
        Rect rect = this.b;
        if (rect != null) {
            aVar.g(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // o.C9240rO2.b
    public void g(float f, C3679Mt.a<Void> aVar) {
        this.b = h(i(), f);
        C3679Mt.a<Void> aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC9367rw.a("There is a new zoomRatio being set"));
        }
        this.d = this.b;
        this.c = aVar;
    }

    public final Rect i() {
        return (Rect) C10907yF1.l((Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
