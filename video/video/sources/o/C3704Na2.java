package o;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o.C10830xw1;
import o.View$OnTouchListenerC4839Yq2;

@Deprecated
/* renamed from: o.Na2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3704Na2 extends GLSurfaceView {
    public static final int k1 = 90;
    public static final float l1 = 0.1f;
    public static final float m1 = 100.0f;
    public static final float n1 = 25.0f;
    public static final float o1 = 3.1415927f;
    public final CopyOnWriteArrayList<b> Y0;
    public final SensorManager Z0;
    @InterfaceC11300zs1
    public final Sensor a1;
    public final C10830xw1 b1;
    public final Handler c1;
    public final View$OnTouchListenerC4839Yq2 d1;
    public final C5839dY1 e1;
    @InterfaceC11300zs1
    public SurfaceTexture f1;
    @InterfaceC11300zs1
    public Surface g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;

    @InterfaceC5056aJ2
    /* renamed from: o.Na2$a */
    /* loaded from: classes2.dex */
    public final class a implements GLSurfaceView.Renderer, View$OnTouchListenerC4839Yq2.a, C10830xw1.a {
        public final C5839dY1 X;
        public final float[] Y0;
        public final float[] Z0;
        public final float[] a1;
        public float b1;
        public float c1;
        public final float[] Y = new float[16];
        public final float[] Z = new float[16];
        public final float[] d1 = new float[16];
        public final float[] e1 = new float[16];

        public a(C5839dY1 c5839dY1) {
            float[] fArr = new float[16];
            this.Y0 = fArr;
            float[] fArr2 = new float[16];
            this.Z0 = fArr2;
            float[] fArr3 = new float[16];
            this.a1 = fArr3;
            this.X = c5839dY1;
            C10898yD0.M(fArr);
            C10898yD0.M(fArr2);
            C10898yD0.M(fArr3);
            this.c1 = 3.1415927f;
        }

        @Override // o.C10830xw1.a
        @InterfaceC9817tn
        public synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.Y0;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.c1 = -f;
            d();
        }

        @Override // o.View$OnTouchListenerC4839Yq2.a
        @InterfaceC6184ey2
        public synchronized void b(PointF pointF) {
            this.b1 = pointF.y;
            d();
            Matrix.setRotateM(this.a1, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public final float c(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d);
            }
            return 90.0f;
        }

        @InterfaceC10251va
        public final void d() {
            Matrix.setRotateM(this.Z0, 0, -this.b1, (float) Math.cos(this.c1), (float) Math.sin(this.c1), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.e1, 0, this.Y0, 0, this.a1, 0);
                Matrix.multiplyMM(this.d1, 0, this.Z0, 0, this.e1, 0);
            }
            Matrix.multiplyMM(this.Z, 0, this.Y, 0, this.d1, 0);
            this.X.c(this.Z, false);
        }

        @Override // o.View$OnTouchListenerC4839Yq2.a
        @InterfaceC6184ey2
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return C3704Na2.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.Y, 0, c(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C3704Na2.this.e(this.X.d());
        }
    }

    /* renamed from: o.Na2$b */
    /* loaded from: classes2.dex */
    public interface b {
        void h(Surface surface);

        void i(Surface surface);
    }

    public C3704Na2(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(C3704Na2 c3704Na2) {
        Surface surface = c3704Na2.g1;
        if (surface != null) {
            Iterator<b> it = c3704Na2.Y0.iterator();
            while (it.hasNext()) {
                it.next().h(surface);
            }
        }
        f(c3704Na2.f1, surface);
        c3704Na2.f1 = null;
        c3704Na2.g1 = null;
    }

    public static /* synthetic */ void b(C3704Na2 c3704Na2, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = c3704Na2.f1;
        Surface surface = c3704Na2.g1;
        Surface surface2 = new Surface(surfaceTexture);
        c3704Na2.f1 = surfaceTexture;
        c3704Na2.g1 = surface2;
        Iterator<b> it = c3704Na2.Y0.iterator();
        while (it.hasNext()) {
            it.next().i(surface2);
        }
        f(surfaceTexture2, surface);
    }

    public static void f(@InterfaceC11300zs1 SurfaceTexture surfaceTexture, @InterfaceC11300zs1 Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public void d(b bVar) {
        this.Y0.add(bVar);
    }

    public final void e(final SurfaceTexture surfaceTexture) {
        this.c1.post(new Runnable() { // from class: o.La2
            @Override // java.lang.Runnable
            public final void run() {
                C3704Na2.b(C3704Na2.this, surfaceTexture);
            }
        });
    }

    public void g(b bVar) {
        this.Y0.remove(bVar);
    }

    public InterfaceC9857tx getCameraMotionListener() {
        return this.e1;
    }

    public InterfaceC5529cG2 getVideoFrameMetadataListener() {
        return this.e1;
    }

    @InterfaceC11300zs1
    public Surface getVideoSurface() {
        return this.g1;
    }

    public final void h() {
        boolean z;
        if (this.h1 && this.i1) {
            z = true;
        } else {
            z = false;
        }
        Sensor sensor = this.a1;
        if (sensor != null && z != this.j1) {
            if (z) {
                this.Z0.registerListener(this.b1, sensor, 0);
            } else {
                this.Z0.unregisterListener(this.b1);
            }
            this.j1 = z;
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c1.post(new Runnable() { // from class: o.Ma2
            @Override // java.lang.Runnable
            public final void run() {
                C3704Na2.a(C3704Na2.this);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.i1 = false;
        h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.i1 = true;
        h();
    }

    public void setDefaultStereoMode(int i) {
        this.e1.e(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.h1 = z;
        h();
    }

    public C3704Na2(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new CopyOnWriteArrayList<>();
        this.c1 = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C9542sf.g(context.getSystemService("sensor"));
        this.Z0 = sensorManager;
        Sensor defaultSensor = TD2.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.a1 = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C5839dY1 c5839dY1 = new C5839dY1();
        this.e1 = c5839dY1;
        a aVar = new a(c5839dY1);
        View$OnTouchListenerC4839Yq2 view$OnTouchListenerC4839Yq2 = new View$OnTouchListenerC4839Yq2(context, aVar, 25.0f);
        this.d1 = view$OnTouchListenerC4839Yq2;
        this.b1 = new C10830xw1(((WindowManager) C9542sf.g((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), view$OnTouchListenerC4839Yq2, aVar);
        this.h1 = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(view$OnTouchListenerC4839Yq2);
    }
}
