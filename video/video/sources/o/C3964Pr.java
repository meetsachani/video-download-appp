package o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* renamed from: o.Pr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3964Pr implements InterfaceC7595kk1<File, ByteBuffer> {
    public static final String a = "ByteBufferFileLoader";

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<ByteBuffer> b(File file, int i, int i2, C5448bw1 c5448bw1) {
        return new InterfaceC7595kk1.a<>(new C7874lt1(file), new a(file));
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }

    /* renamed from: o.Pr$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC9990uU<ByteBuffer> {
        public final File X;

        public a(File file) {
            this.X = file;
        }

        @Override // o.InterfaceC9990uU
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // o.InterfaceC9990uU
        public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(C4452Ur.a(this.X));
            } catch (IOException e) {
                if (Log.isLoggable(C3964Pr.a, 3)) {
                    Log.d(C3964Pr.a, "Failed to obtain ByteBuffer for file", e);
                }
                aVar.c(e);
            }
        }

        @Override // o.InterfaceC9990uU
        public GU e() {
            return GU.LOCAL;
        }

        @Override // o.InterfaceC9990uU
        public void b() {
        }

        @Override // o.InterfaceC9990uU
        public void cancel() {
        }
    }

    /* renamed from: o.Pr$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC7838lk1<File, ByteBuffer> {
        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<File, ByteBuffer> e(C5650cm1 c5650cm1) {
            return new C3964Pr();
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
