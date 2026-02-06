package o;

import android.content.Context;
import java.io.File;
import o.C5964e40;

/* renamed from: o.Mj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3640Mj0 extends C5964e40 {

    /* renamed from: o.Mj0$a */
    /* loaded from: classes.dex */
    public class a implements C5964e40.c {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // o.C5964e40.c
        public File a() {
            File b = b();
            if (b != null && b.exists()) {
                return b;
            }
            File externalCacheDir = this.a.getExternalCacheDir();
            if (externalCacheDir != null && externalCacheDir.canWrite()) {
                if (this.b != null) {
                    return new File(externalCacheDir, this.b);
                }
                return externalCacheDir;
            }
            return b;
        }

        public final File b() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.b != null) {
                return new File(cacheDir, this.b);
            }
            return cacheDir;
        }
    }

    public C3640Mj0(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C3640Mj0(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public C3640Mj0(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
