package o;

import android.content.Context;
import java.io.File;
import o.C5964e40;
import o.Y30;

@Deprecated
/* renamed from: o.Lj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3543Lj0 extends C5964e40 {

    /* renamed from: o.Lj0$a */
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
            File externalCacheDir = this.a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            if (this.b != null) {
                return new File(externalCacheDir, this.b);
            }
            return externalCacheDir;
        }
    }

    public C3543Lj0(Context context) {
        this(context, "image_manager_disk_cache", Y30.a.a);
    }

    public C3543Lj0(Context context, int i) {
        this(context, "image_manager_disk_cache", i);
    }

    public C3543Lj0(Context context, String str, int i) {
        super(new a(context, str), i);
    }
}
