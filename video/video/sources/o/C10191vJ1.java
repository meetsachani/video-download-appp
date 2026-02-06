package o;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import o.C10898yD0;
import o.C9705tJ1;

@Deprecated
/* renamed from: o.vJ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10191vJ1 {
    public static final String j = "ProjectionRenderer";
    public static final String k = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";
    public static final String l = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";
    public static final float[] m = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: o  reason: collision with root package name */
    public static final float[] f893o = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] q = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};
    public int a;
    @InterfaceC11300zs1
    public a b;
    @InterfaceC11300zs1
    public a c;
    public C10412wD0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    /* renamed from: o.vJ1$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final int a;
        public final FloatBuffer b;
        public final FloatBuffer c;
        public final int d;

        public a(C9705tJ1.c cVar) {
            this.a = cVar.a();
            this.b = C10898yD0.j(cVar.c);
            this.c = C10898yD0.j(cVar.d);
            int i = cVar.b;
            if (i != 1) {
                if (i != 2) {
                    this.d = 4;
                    return;
                } else {
                    this.d = 6;
                    return;
                }
            }
            this.d = 5;
        }
    }

    public static boolean c(C9705tJ1 c9705tJ1) {
        C9705tJ1.b bVar = c9705tJ1.a;
        C9705tJ1.b bVar2 = c9705tJ1.b;
        if (bVar.b() != 1 || bVar.a(0).a != 0 || bVar2.b() != 1 || bVar2.a(0).a != 0) {
            return false;
        }
        return true;
    }

    public void a(int i, float[] fArr, boolean z) {
        a aVar;
        float[] fArr2;
        if (z) {
            aVar = this.c;
        } else {
            aVar = this.b;
        }
        a aVar2 = aVar;
        if (aVar2 != null) {
            int i2 = this.a;
            if (i2 == 1) {
                if (z) {
                    fArr2 = f893o;
                } else {
                    fArr2 = n;
                }
            } else if (i2 == 2) {
                if (z) {
                    fArr2 = q;
                } else {
                    fArr2 = p;
                }
            } else {
                fArr2 = m;
            }
            GLES20.glUniformMatrix3fv(this.f, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.i, 0);
            try {
                C10898yD0.e();
            } catch (C10898yD0.b e) {
                Log.e(j, "Failed to bind uniforms", e);
            }
            GLES20.glVertexAttribPointer(this.g, 3, 5126, false, 12, (Buffer) aVar2.b);
            try {
                C10898yD0.e();
            } catch (C10898yD0.b e2) {
                Log.e(j, "Failed to load position data", e2);
            }
            GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 8, (Buffer) aVar2.c);
            try {
                C10898yD0.e();
            } catch (C10898yD0.b e3) {
                Log.e(j, "Failed to load texture data", e3);
            }
            GLES20.glDrawArrays(aVar2.d, 0, aVar2.a);
            try {
                C10898yD0.e();
            } catch (C10898yD0.b e4) {
                Log.e(j, "Failed to render", e4);
            }
        }
    }

    public void b() {
        try {
            C10412wD0 c10412wD0 = new C10412wD0(k, l);
            this.d = c10412wD0;
            this.e = c10412wD0.l("uMvpMatrix");
            this.f = this.d.l("uTexMatrix");
            this.g = this.d.g("aPosition");
            this.h = this.d.g("aTexCoords");
            this.i = this.d.l("uTexture");
        } catch (C10898yD0.b e) {
            Log.e(j, "Failed to initialize the program", e);
        }
    }

    public void d(C9705tJ1 c9705tJ1) {
        if (!c(c9705tJ1)) {
            return;
        }
        this.a = c9705tJ1.c;
        a aVar = new a(c9705tJ1.a.a(0));
        this.b = aVar;
        if (!c9705tJ1.d) {
            aVar = new a(c9705tJ1.b.a(0));
        }
        this.c = aVar;
    }

    public void e() {
        C10412wD0 c10412wD0 = this.d;
        if (c10412wD0 != null) {
            try {
                c10412wD0.f();
            } catch (C10898yD0.b e) {
                Log.e(j, "Failed to delete the shader program", e);
            }
        }
    }
}
