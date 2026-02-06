package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import o.InterfaceC8499oN0;
import o.NU1;
import o.T12;

/* renamed from: o.yO2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10944yO2 implements InterfaceC9969uO2 {
    public static final String k = "ZslControlImpl";
    public static final int l = 3;
    public static final int m = 9;
    public final C7641kw a;
    public final BO2 b;
    public boolean c = false;
    public boolean d = false;
    public boolean e;
    public boolean f;
    public androidx.camera.core.l g;
    public AbstractC3393Jv h;
    public D10 i;
    public ImageWriter j;

    public C10944yO2(C7641kw c7641kw) {
        this.e = false;
        this.f = false;
        this.a = c7641kw;
        this.e = CO2.a(c7641kw, 4);
        this.f = X20.a(AO2.class) != null;
        this.b = new BO2(3, new NU1.a() { // from class: o.wO2
            @Override // o.NU1.a
            public final void a(Object obj) {
                ((androidx.camera.core.g) obj).close();
            }
        });
    }

    public static /* synthetic */ void h(C10944yO2 c10944yO2, InterfaceC8499oN0 interfaceC8499oN0) {
        c10944yO2.getClass();
        try {
            androidx.camera.core.g a2 = interfaceC8499oN0.a();
            if (a2 != null) {
                c10944yO2.b.c(a2);
            }
        } catch (IllegalStateException e) {
            C7433k41.c(k, "Failed to acquire latest image IllegalStateException = " + e.getMessage());
        }
    }

    @Override // o.InterfaceC9969uO2
    public void a(boolean z) {
        this.c = z;
    }

    @Override // o.InterfaceC9969uO2
    public void b(T12.b bVar) {
        j();
        if (!this.c && !this.f) {
            Map<Integer, Size> k2 = k(this.a);
            if (this.e && !k2.isEmpty() && k2.containsKey(34) && l(this.a, 34)) {
                Size size = k2.get(34);
                androidx.camera.core.j jVar = new androidx.camera.core.j(size.getWidth(), size.getHeight(), 34, 9);
                this.h = jVar.m();
                this.g = new androidx.camera.core.l(jVar);
                jVar.f(new InterfaceC8499oN0.a() { // from class: o.xO2
                    @Override // o.InterfaceC8499oN0.a
                    public final void a(InterfaceC8499oN0 interfaceC8499oN0) {
                        C10944yO2.h(C10944yO2.this, interfaceC8499oN0);
                    }
                }, C5211ay.d());
                MN0 mn0 = new MN0(this.g.getSurface(), new Size(this.g.getWidth(), this.g.getHeight()), 34);
                this.i = mn0;
                androidx.camera.core.l lVar = this.g;
                InterfaceFutureC8411o11<Void> k3 = mn0.k();
                Objects.requireNonNull(lVar);
                k3.h4(new RunnableC10212vO2(lVar), C5211ay.f());
                bVar.n(this.i);
                bVar.e(this.h);
                bVar.m(new a());
                bVar.y(new InputConfiguration(this.g.getWidth(), this.g.getHeight(), this.g.c()));
            }
        }
    }

    @Override // o.InterfaceC9969uO2
    public boolean c() {
        return this.c;
    }

    @Override // o.InterfaceC9969uO2
    public void d(boolean z) {
        this.d = z;
    }

    @Override // o.InterfaceC9969uO2
    public androidx.camera.core.g e() {
        try {
            return this.b.b();
        } catch (NoSuchElementException unused) {
            C7433k41.c(k, "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // o.InterfaceC9969uO2
    public boolean f(androidx.camera.core.g gVar) {
        Image X4 = gVar.X4();
        ImageWriter imageWriter = this.j;
        if (imageWriter != null && X4 != null) {
            try {
                AN0.e(imageWriter, X4);
                return true;
            } catch (IllegalStateException e) {
                C7433k41.c(k, "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
            }
        }
        return false;
    }

    @Override // o.InterfaceC9969uO2
    public boolean g() {
        return this.d;
    }

    public final void j() {
        BO2 bo2 = this.b;
        while (!bo2.isEmpty()) {
            bo2.b().close();
        }
        D10 d10 = this.i;
        if (d10 != null) {
            androidx.camera.core.l lVar = this.g;
            if (lVar != null) {
                d10.k().h4(new RunnableC10212vO2(lVar), C5211ay.f());
                this.g = null;
            }
            d10.d();
            this.i = null;
        }
        ImageWriter imageWriter = this.j;
        if (imageWriter != null) {
            imageWriter.close();
            this.j = null;
        }
    }

    public final Map<Integer, Size> k(C7641kw c7641kw) {
        StreamConfigurationMap streamConfigurationMap;
        int[] inputFormats;
        try {
            streamConfigurationMap = (StreamConfigurationMap) c7641kw.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            C7433k41.c(k, "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap != null && streamConfigurationMap.getInputFormats() != null) {
            HashMap hashMap = new HashMap();
            for (int i : streamConfigurationMap.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new C8474oH(true));
                    hashMap.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
            return hashMap;
        }
        return new HashMap();
    }

    public final boolean l(C7641kw c7641kw, int i) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c7641kw.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i)) == null) {
            return false;
        }
        for (int i2 : validOutputFormatsForInput) {
            if (i2 == 256) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o.yO2$a */
    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.StateCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                C10944yO2.this.j = AN0.c(inputSurface, 1);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }
    }
}
