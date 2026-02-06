package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.C3588Lv;
import o.C3597Ly;
import o.C4863Yy;
import o.InterfaceC8763pS1;
import o.T12;

/* renamed from: o.Dv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2794Dv implements InterfaceC8763pS1 {
    public static final String e = "Camera2RequestProcessor";
    public final C4863Yy a;
    public final List<C5231b22> b;
    public volatile boolean c = false;
    public volatile T12 d;

    /* renamed from: o.Dv$a */
    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        public final InterfaceC8763pS1.a a;
        public final InterfaceC8763pS1.b b;
        public final boolean c;

        public a(InterfaceC8763pS1.b bVar, InterfaceC8763pS1.a aVar, boolean z) {
            this.a = aVar;
            this.b = bVar;
            this.c = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            this.a.e(this.b, j, C2794Dv.this.h(surface));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.a.c(this.b, new C5195au(totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.a.d(this.b, new C4955Zt(C3588Lv.a.ERROR, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.a.g(this.b, new C5195au(captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            if (this.c) {
                this.a.a(i);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            if (this.c) {
                this.a.b(i, j);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.a.f(this.b, j2, j);
        }
    }

    public C2794Dv(C4863Yy c4863Yy, List<C5231b22> list) {
        boolean z = c4863Yy.l == C4863Yy.e.OPENED;
        C10907yF1.b(z, "CaptureSession state must be OPENED. Current state:" + c4863Yy.l);
        this.a = c4863Yy;
        this.b = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // o.InterfaceC8763pS1
    public void a() {
        if (this.c) {
            return;
        }
        this.a.x();
    }

    @Override // o.InterfaceC8763pS1
    public void b() {
        if (this.c) {
            return;
        }
        this.a.l();
    }

    @Override // o.InterfaceC8763pS1
    public int c(InterfaceC8763pS1.b bVar, InterfaceC8763pS1.a aVar) {
        if (!this.c && j(bVar)) {
            T12.b bVar2 = new T12.b();
            bVar2.z(bVar.a());
            bVar2.x(bVar.getParameters());
            bVar2.e(C3402Jy.d(new a(bVar, aVar, true)));
            if (this.d != null) {
                for (AbstractC3393Jv abstractC3393Jv : this.d.h()) {
                    bVar2.e(abstractC3393Jv);
                }
                C4133Rk2 h = this.d.i().h();
                for (String str : h.e()) {
                    bVar2.p(str, h.d(str));
                }
            }
            for (Integer num : bVar.b()) {
                bVar2.n(i(num.intValue()));
            }
            return this.a.t(bVar2.q());
        }
        return -1;
    }

    @Override // o.InterfaceC8763pS1
    public int d(List<InterfaceC8763pS1.b> list, InterfaceC8763pS1.a aVar) {
        if (!this.c && f(list)) {
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            for (InterfaceC8763pS1.b bVar : list) {
                C3597Ly.a aVar2 = new C3597Ly.a();
                aVar2.w(bVar.a());
                aVar2.v(bVar.getParameters());
                aVar2.c(C3402Jy.d(new a(bVar, aVar, z)));
                for (Integer num : bVar.b()) {
                    aVar2.f(i(num.intValue()));
                }
                arrayList.add(aVar2.h());
                z = false;
            }
            return this.a.r(arrayList);
        }
        return -1;
    }

    @Override // o.InterfaceC8763pS1
    public int e(InterfaceC8763pS1.b bVar, InterfaceC8763pS1.a aVar) {
        return d(Arrays.asList(bVar), aVar);
    }

    public final boolean f(List<InterfaceC8763pS1.b> list) {
        for (InterfaceC8763pS1.b bVar : list) {
            if (!j(bVar)) {
                return false;
            }
        }
        return true;
    }

    public void g() {
        this.c = true;
    }

    public int h(Surface surface) {
        for (C5231b22 c5231b22 : this.b) {
            if (c5231b22.j().get() == surface) {
                return c5231b22.r();
            }
            continue;
        }
        return -1;
    }

    public final D10 i(int i) {
        for (C5231b22 c5231b22 : this.b) {
            if (c5231b22.r() == i) {
                return c5231b22;
            }
        }
        return null;
    }

    public final boolean j(InterfaceC8763pS1.b bVar) {
        if (bVar.b().isEmpty()) {
            C7433k41.c(e, "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (Integer num : bVar.b()) {
            if (i(num.intValue()) == null) {
                C7433k41.c(e, "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    public void k(T12 t12) {
        this.d = t12;
    }
}
