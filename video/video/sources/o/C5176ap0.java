package o;

import java.io.File;
import java.io.IOException;

/* renamed from: o.ap0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5176ap0 {
    public static final C5176ap0 b = new C5176ap0("Normal");
    public static final C5176ap0 c = new a();
    public final String a;

    /* renamed from: o.ap0$a */
    /* loaded from: classes4.dex */
    public static class a extends C5176ap0 {
        public a() {
            super("Force");
        }

        @Override // o.C5176ap0
        public boolean c(File file) throws IOException {
            C3961Pq0.k0(file);
            return true;
        }
    }

    public C5176ap0(String str) {
        this.a = str;
    }

    public void a(File file) throws IOException {
        if (file.exists() && !c(file)) {
            throw new IOException("Deletion failed: " + file);
        }
    }

    public boolean b(File file) {
        if (file != null && file.exists()) {
            try {
                return c(file);
            } catch (IOException unused) {
                return false;
            }
        }
        return true;
    }

    public boolean c(File file) throws IOException {
        C3961Pq0.e0(file);
        return true;
    }

    public String toString() {
        return "FileDeleteStrategy[" + this.a + C6566gU0.g;
    }
}
