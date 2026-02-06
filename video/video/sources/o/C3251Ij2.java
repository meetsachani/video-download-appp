package o;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3016Ga;
import o.InterfaceC10290vj2;

/* renamed from: o.Ij2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3251Ij2 extends InterfaceC10290vj2.a {
    public final List<InterfaceC10290vj2.a> a;

    public C3251Ij2(List<InterfaceC10290vj2.a> list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(list);
    }

    public static InterfaceC10290vj2.a C(InterfaceC10290vj2.a... aVarArr) {
        return new C3251Ij2(Arrays.asList(aVarArr));
    }

    @Override // o.InterfaceC10290vj2.a
    public void A(InterfaceC10290vj2 interfaceC10290vj2) {
        for (InterfaceC10290vj2.a aVar : this.a) {
            aVar.A(interfaceC10290vj2);
        }
    }

    @Override // o.InterfaceC10290vj2.a
    public void B(InterfaceC10290vj2 interfaceC10290vj2, Surface surface) {
        for (InterfaceC10290vj2.a aVar : this.a) {
            aVar.B(interfaceC10290vj2, surface);
        }
    }

    @Override // o.InterfaceC10290vj2.a
    public void u(InterfaceC10290vj2 interfaceC10290vj2) {
        for (InterfaceC10290vj2.a aVar : this.a) {
            aVar.u(interfaceC10290vj2);
        }
    }

    @Override // o.InterfaceC10290vj2.a
    public void v(InterfaceC10290vj2 interfaceC10290vj2) {
        for (InterfaceC10290vj2.a aVar : this.a) {
            aVar.v(interfaceC10290vj2);
        }
    }

    @Override // o.InterfaceC10290vj2.a
    public void w(InterfaceC10290vj2 interfaceC10290vj2) {
        for (InterfaceC10290vj2.a aVar : this.a) {
            aVar.w(interfaceC10290vj2);
        }
    }

    @Override // o.InterfaceC10290vj2.a
    public void x(InterfaceC10290vj2 interfaceC10290vj2) {
        for (InterfaceC10290vj2.a aVar : this.a) {
            aVar.x(interfaceC10290vj2);
        }
    }

    @Override // o.InterfaceC10290vj2.a
    public void y(InterfaceC10290vj2 interfaceC10290vj2) {
        for (InterfaceC10290vj2.a aVar : this.a) {
            aVar.y(interfaceC10290vj2);
        }
    }

    @Override // o.InterfaceC10290vj2.a
    public void z(InterfaceC10290vj2 interfaceC10290vj2) {
        for (InterfaceC10290vj2.a aVar : this.a) {
            aVar.z(interfaceC10290vj2);
        }
    }

    /* renamed from: o.Ij2$a */
    /* loaded from: classes.dex */
    public static class a extends InterfaceC10290vj2.a {
        public final CameraCaptureSession.StateCallback a;

        public a(CameraCaptureSession.StateCallback stateCallback) {
            this.a = stateCallback;
        }

        @Override // o.InterfaceC10290vj2.a
        public void B(InterfaceC10290vj2 interfaceC10290vj2, Surface surface) {
            C3016Ga.b.a(this.a, interfaceC10290vj2.s().e(), surface);
        }

        @Override // o.InterfaceC10290vj2.a
        public void u(InterfaceC10290vj2 interfaceC10290vj2) {
            this.a.onActive(interfaceC10290vj2.s().e());
        }

        @Override // o.InterfaceC10290vj2.a
        public void v(InterfaceC10290vj2 interfaceC10290vj2) {
            C3016Ga.d.b(this.a, interfaceC10290vj2.s().e());
        }

        @Override // o.InterfaceC10290vj2.a
        public void w(InterfaceC10290vj2 interfaceC10290vj2) {
            this.a.onClosed(interfaceC10290vj2.s().e());
        }

        @Override // o.InterfaceC10290vj2.a
        public void x(InterfaceC10290vj2 interfaceC10290vj2) {
            this.a.onConfigureFailed(interfaceC10290vj2.s().e());
        }

        @Override // o.InterfaceC10290vj2.a
        public void y(InterfaceC10290vj2 interfaceC10290vj2) {
            this.a.onConfigured(interfaceC10290vj2.s().e());
        }

        @Override // o.InterfaceC10290vj2.a
        public void z(InterfaceC10290vj2 interfaceC10290vj2) {
            this.a.onReady(interfaceC10290vj2.s().e());
        }

        public a(List<CameraCaptureSession.StateCallback> list) {
            this(C6914hw.a(list));
        }

        @Override // o.InterfaceC10290vj2.a
        public void A(InterfaceC10290vj2 interfaceC10290vj2) {
        }
    }
}
