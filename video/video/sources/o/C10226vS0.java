package o;

import android.content.Context;
import java.io.File;
import o.C5964e40;

/* renamed from: o.vS0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10226vS0 extends C5964e40 {

    /* renamed from: o.vS0$a */
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

    public C10226vS0(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C10226vS0(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public C10226vS0(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
