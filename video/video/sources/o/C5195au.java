package o;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;
import o.C2540Bg0;
import o.C3686Mv;

/* renamed from: o.au  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5195au implements InterfaceC3784Nv {
    public static final String c = "C2CameraCaptureResult";
    public final C4133Rk2 a;
    public final CaptureResult b;

    public C5195au(C4133Rk2 c4133Rk2, CaptureResult captureResult) {
        this.a = c4133Rk2;
        this.b = captureResult;
    }

    @Override // o.InterfaceC3784Nv
    public C4133Rk2 a() {
        return this.a;
    }

    @Override // o.InterfaceC3784Nv
    public void b(C2540Bg0.b bVar) {
        super.b(bVar);
        Rect rect = (Rect) this.b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.k(rect.width()).j(rect.height());
        }
        try {
            Integer num = (Integer) this.b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.n(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            C7433k41.p(c, "Failed to get JPEG orientation.");
        }
        Long l = (Long) this.b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            bVar.g(l.longValue());
        }
        Float f = (Float) this.b.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            bVar.m(f.floatValue());
        }
        Integer num2 = (Integer) this.b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            Integer num3 = (Integer) this.b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num3 != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (num3.intValue() / 100.0f)));
            }
            bVar.l(num2.intValue());
        }
        Float f2 = (Float) this.b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            bVar.i(f2.floatValue());
        }
        Integer num4 = (Integer) this.b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            C2540Bg0.c cVar = C2540Bg0.c.AUTO;
            if (num4.intValue() == 0) {
                cVar = C2540Bg0.c.MANUAL;
            }
            bVar.o(cVar);
        }
    }

    @Override // o.InterfaceC3784Nv
    public long c() {
        Long l = (Long) this.b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // o.InterfaceC3784Nv
    public C3686Mv.e d() {
        Integer num = (Integer) this.b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return C3686Mv.e.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3 && intValue != 4) {
                    C7433k41.c(c, "Undefined flash state: " + num);
                    return C3686Mv.e.UNKNOWN;
                }
                return C3686Mv.e.FIRED;
            }
            return C3686Mv.e.READY;
        }
        return C3686Mv.e.NONE;
    }

    @Override // o.InterfaceC3784Nv
    public CaptureResult e() {
        return this.b;
    }

    @Override // o.InterfaceC3784Nv
    public C3686Mv.c f() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return C3686Mv.c.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return C3686Mv.c.INACTIVE;
            case 1:
            case 3:
                return C3686Mv.c.SCANNING;
            case 2:
                return C3686Mv.c.PASSIVE_FOCUSED;
            case 4:
                return C3686Mv.c.LOCKED_FOCUSED;
            case 5:
                return C3686Mv.c.LOCKED_NOT_FOCUSED;
            case 6:
                return C3686Mv.c.PASSIVE_NOT_FOCUSED;
            default:
                C7433k41.c(c, "Undefined af state: " + num);
                return C3686Mv.c.UNKNOWN;
        }
    }

    @Override // o.InterfaceC3784Nv
    public C3686Mv.d g() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return C3686Mv.d.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        C7433k41.c(c, "Undefined awb state: " + num);
                        return C3686Mv.d.UNKNOWN;
                    }
                    return C3686Mv.d.LOCKED;
                }
                return C3686Mv.d.CONVERGED;
            }
            return C3686Mv.d.METERING;
        }
        return C3686Mv.d.INACTIVE;
    }

    @Override // o.InterfaceC3784Nv
    public C3686Mv.b h() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return C3686Mv.b.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1 && intValue != 2) {
                if (intValue != 3 && intValue != 4) {
                    if (intValue != 5) {
                        C7433k41.c(c, "Undefined af mode: " + num);
                        return C3686Mv.b.UNKNOWN;
                    }
                } else {
                    return C3686Mv.b.ON_CONTINUOUS_AUTO;
                }
            } else {
                return C3686Mv.b.ON_MANUAL_AUTO;
            }
        }
        return C3686Mv.b.OFF;
    }

    @Override // o.InterfaceC3784Nv
    public C3686Mv.a i() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return C3686Mv.a.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                C7433k41.c(c, "Undefined ae state: " + num);
                                return C3686Mv.a.UNKNOWN;
                            }
                        } else {
                            return C3686Mv.a.FLASH_REQUIRED;
                        }
                    } else {
                        return C3686Mv.a.LOCKED;
                    }
                } else {
                    return C3686Mv.a.CONVERGED;
                }
            }
            return C3686Mv.a.SEARCHING;
        }
        return C3686Mv.a.INACTIVE;
    }

    public C5195au(CaptureResult captureResult) {
        this(C4133Rk2.b(), captureResult);
    }
}
