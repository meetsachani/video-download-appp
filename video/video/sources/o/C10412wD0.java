package o;

import android.content.Context;
import android.opengl.GLES20;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import o.C10898yD0;

@Deprecated
/* renamed from: o.wD0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10412wD0 {
    public static final int f = 35815;
    public final int a;
    public final a[] b;
    public final b[] c;
    public final Map<String, a> d;
    public final Map<String, b> e;

    /* renamed from: o.wD0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final int b;
        public final int c;
        @InterfaceC11300zs1
        public Buffer d;
        public int e;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public static a b(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, C10412wD0.j(bArr));
            return new a(str, i2, C10412wD0.h(i, str));
        }

        public void a() throws C10898yD0.b {
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.c, this.e, 5126, false, 0, (Buffer) C9542sf.h(this.d, "call setBuffer before bind"));
            GLES20.glEnableVertexAttribArray(this.b);
            C10898yD0.e();
        }

        public void c(float[] fArr, int i) {
            this.d = C10898yD0.j(fArr);
            this.e = i;
        }
    }

    /* renamed from: o.wD0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final float[] d = new float[16];
        public int e;
        public int f;
        public int g;

        public b(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public static b b(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, C10412wD0.j(bArr));
            return new b(str, C10412wD0.k(i, str), iArr2[0]);
        }

        public void a() throws C10898yD0.b {
            int i;
            switch (this.c) {
                case 5124:
                    GLES20.glUniform1i(this.b, this.e);
                    return;
                case 5126:
                    GLES20.glUniform1fv(this.b, 1, this.d, 0);
                    C10898yD0.e();
                    return;
                case 35664:
                    GLES20.glUniform2fv(this.b, 1, this.d, 0);
                    C10898yD0.e();
                    return;
                case 35665:
                    GLES20.glUniform3fv(this.b, 1, this.d, 0);
                    C10898yD0.e();
                    return;
                case 35675:
                    GLES20.glUniformMatrix3fv(this.b, 1, false, this.d, 0);
                    C10898yD0.e();
                    return;
                case 35676:
                    GLES20.glUniformMatrix4fv(this.b, 1, false, this.d, 0);
                    C10898yD0.e();
                    return;
                case 35678:
                case C10412wD0.f /* 35815 */:
                case 36198:
                    if (this.f != 0) {
                        GLES20.glActiveTexture(this.g + 33984);
                        C10898yD0.e();
                        if (this.c == 35678) {
                            i = 3553;
                        } else {
                            i = 36197;
                        }
                        C10898yD0.c(i, this.f);
                        GLES20.glUniform1i(this.b, this.g);
                        C10898yD0.e();
                        return;
                    }
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                default:
                    throw new IllegalStateException("Unexpected uniform type: " + this.c);
            }
        }

        public void c(float f) {
            this.d[0] = f;
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.d, 0, fArr.length);
        }

        public void e(int i) {
            this.e = i;
        }

        public void f(int i, int i2) {
            this.f = i;
            this.g = i2;
        }
    }

    public C10412wD0(Context context, String str, String str2) throws IOException, C10898yD0.b {
        this(m(context, str), m(context, str2));
    }

    public static void d(int i, int i2, String str) throws C10898yD0.b {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        }
        C10898yD0.f(z, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        C10898yD0.e();
    }

    public static int h(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    public static int j(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    public static int k(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public static String m(Context context, String str) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            return TD2.N(TD2.S1(inputStream));
        } finally {
            TD2.t(inputStream);
        }
    }

    public void e() throws C10898yD0.b {
        for (a aVar : this.b) {
            aVar.a();
        }
        for (b bVar : this.c) {
            bVar.a();
        }
    }

    public void f() throws C10898yD0.b {
        GLES20.glDeleteProgram(this.a);
        C10898yD0.e();
    }

    public int g(String str) throws C10898yD0.b {
        int i = i(str);
        GLES20.glEnableVertexAttribArray(i);
        C10898yD0.e();
        return i;
    }

    public final int i(String str) {
        return h(this.a, str);
    }

    public int l(String str) {
        return k(this.a, str);
    }

    public void n(String str, float[] fArr, int i) {
        ((a) C9542sf.g(this.d.get(str))).c(fArr, i);
    }

    public void o(String str, float f2) {
        ((b) C9542sf.g(this.e.get(str))).c(f2);
    }

    public void p(String str, float[] fArr) {
        ((b) C9542sf.g(this.e.get(str))).d(fArr);
    }

    public void q(String str, int i) {
        ((b) C9542sf.g(this.e.get(str))).e(i);
    }

    public void r(String str, int i, int i2) {
        ((b) C9542sf.g(this.e.get(str))).f(i, i2);
    }

    public void s() throws C10898yD0.b {
        GLES20.glUseProgram(this.a);
        C10898yD0.e();
    }

    public C10412wD0(String str, String str2) throws C10898yD0.b {
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        C10898yD0.e();
        d(glCreateProgram, 35633, str);
        d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        C10898yD0.f(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.b = new a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            a b2 = a.b(this.a, i);
            this.b[i] = b2;
            this.d.put(b2.a, b2);
        }
        this.e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr3, 0);
        this.c = new b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            b b3 = b.b(this.a, i2);
            this.c[i2] = b3;
            this.e.put(b3.a, b3);
        }
        C10898yD0.e();
    }
}
