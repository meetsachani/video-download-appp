package o;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o.C10898yD0;

@Deprecated
/* loaded from: classes2.dex */
public final class AF2 extends GLSurfaceView implements CF2 {
    public static final String Z0 = "VideoDecoderGLSV";
    public final a Y0;

    /* loaded from: classes2.dex */
    public static final class a implements GLSurfaceView.Renderer {
        public static final String i1 = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";
        public static final String k1 = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";
        public final GLSurfaceView X;
        public C10412wD0 c1;
        public int d1;
        public BF2 e1;
        public static final float[] f1 = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        public static final float[] g1 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        public static final float[] h1 = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        public static final String[] j1 = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer l1 = C10898yD0.j(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        public final int[] Y = new int[3];
        public final int[] Z = new int[3];
        public final int[] Y0 = new int[3];
        public final int[] Z0 = new int[3];
        public final AtomicReference<BF2> a1 = new AtomicReference<>();
        public final FloatBuffer[] b1 = new FloatBuffer[3];

        public a(GLSurfaceView gLSurfaceView) {
            this.X = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.Y0;
                this.Z0[i] = -1;
                iArr[i] = -1;
            }
        }

        public void a(BF2 bf2) {
            BF2 andSet = this.a1.getAndSet(bf2);
            if (andSet != null) {
                andSet.v();
            }
            this.X.requestRender();
        }

        @HS1({"program"})
        public final void b() {
            try {
                GLES20.glGenTextures(3, this.Y, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.c1.l(j1[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    C10898yD0.c(3553, this.Y[i]);
                }
                C10898yD0.e();
            } catch (C10898yD0.b e) {
                Log.e(AF2.Z0, "Failed to set up the textures", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            boolean z;
            int i;
            BF2 andSet = this.a1.getAndSet(null);
            if (andSet == null && this.e1 == null) {
                return;
            }
            if (andSet != null) {
                BF2 bf2 = this.e1;
                if (bf2 != null) {
                    bf2.v();
                }
                this.e1 = andSet;
            }
            BF2 bf22 = (BF2) C9542sf.g(this.e1);
            float[] fArr = g1;
            int i2 = bf22.g1;
            if (i2 != 1) {
                if (i2 == 3) {
                    fArr = h1;
                }
            } else {
                fArr = f1;
            }
            GLES20.glUniformMatrix3fv(this.d1, 1, false, fArr, 0);
            int[] iArr = (int[]) C9542sf.g(bf22.f1);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) C9542sf.g(bf22.e1);
            for (int i3 = 0; i3 < 3; i3++) {
                if (i3 == 0) {
                    i = bf22.c1;
                } else {
                    i = (bf22.c1 + 1) / 2;
                }
                int i4 = i;
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.Y[i3]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i3], i4, 0, 6409, 5121, byteBufferArr[i3]);
            }
            int i5 = bf22.b1;
            int i6 = (i5 + 1) / 2;
            int[] iArr2 = {i5, i6, i6};
            for (int i7 = 0; i7 < 3; i7++) {
                if (this.Y0[i7] != iArr2[i7] || this.Z0[i7] != iArr[i7]) {
                    if (iArr[i7] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C9542sf.i(z);
                    float f = iArr2[i7] / iArr[i7];
                    this.b1[i7] = C10898yD0.j(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.Z[i7], 2, 5126, false, 0, (Buffer) this.b1[i7]);
                    this.Y0[i7] = iArr2[i7];
                    this.Z0[i7] = iArr[i7];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                C10898yD0.e();
            } catch (C10898yD0.b e) {
                Log.e(AF2.Z0, "Failed to draw a frame", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                C10412wD0 c10412wD0 = new C10412wD0(i1, k1);
                this.c1 = c10412wD0;
                GLES20.glVertexAttribPointer(c10412wD0.g("in_pos"), 2, 5126, false, 0, (Buffer) l1);
                this.Z[0] = this.c1.g("in_tc_y");
                this.Z[1] = this.c1.g("in_tc_u");
                this.Z[2] = this.c1.g("in_tc_v");
                this.d1 = this.c1.l("mColorConversion");
                C10898yD0.e();
                b();
                C10898yD0.e();
            } catch (C10898yD0.b e) {
                Log.e(AF2.Z0, "Failed to set up the textures and program", e);
            }
        }
    }

    public AF2(Context context) {
        this(context, null);
    }

    @Override // o.CF2
    public void setOutputBuffer(BF2 bf2) {
        this.Y0.a(bf2);
    }

    public AF2(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.Y0 = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public CF2 getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
