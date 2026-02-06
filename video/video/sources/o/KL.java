package o;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class KL {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 1;
    public final g a;

    /* loaded from: classes.dex */
    public static final class a {
        public static Pair<ContentInfo, ContentInfo> a(ContentInfo contentInfo, final Predicate<ClipData.Item> predicate) {
            ContentInfo contentInfo2;
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                if (test) {
                    contentInfo2 = contentInfo;
                } else {
                    contentInfo2 = null;
                }
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> h = KL.h(clip, new LF1() { // from class: o.JL
                @Override // o.LF1
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (h.first == null) {
                return Pair.create(null, contentInfo);
            }
            if (h.second == null) {
                return Pair.create(contentInfo, null);
            }
            return Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) h.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) h.second).build());
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i);

        void b(Uri uri);

        KL build();

        void c(ClipData clipData);

        void i(int i);

        void setExtras(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static final class f implements g {
        public final ContentInfo a;

        public f(ContentInfo contentInfo) {
            this.a = IL.a(C10907yF1.l(contentInfo));
        }

        @Override // o.KL.g
        public int Y() {
            int flags;
            flags = this.a.getFlags();
            return flags;
        }

        @Override // o.KL.g
        public int a() {
            int source;
            source = this.a.getSource();
            return source;
        }

        @Override // o.KL.g
        public Uri b() {
            Uri linkUri;
            linkUri = this.a.getLinkUri();
            return linkUri;
        }

        @Override // o.KL.g
        public ContentInfo c() {
            return this.a;
        }

        @Override // o.KL.g
        public ClipData d() {
            ClipData clip;
            clip = this.a.getClip();
            return clip;
        }

        @Override // o.KL.g
        public Bundle getExtras() {
            Bundle extras;
            extras = this.a.getExtras();
            return extras;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        int Y();

        int a();

        Uri b();

        ContentInfo c();

        ClipData d();

        Bundle getExtras();
    }

    /* loaded from: classes.dex */
    public static final class h implements g {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public h(e eVar) {
            this.a = (ClipData) C10907yF1.l(eVar.a);
            this.b = C10907yF1.g(eVar.b, 0, 5, "source");
            this.c = C10907yF1.k(eVar.c, 1);
            this.d = eVar.d;
            this.e = eVar.e;
        }

        @Override // o.KL.g
        public int Y() {
            return this.c;
        }

        @Override // o.KL.g
        public int a() {
            return this.b;
        }

        @Override // o.KL.g
        public Uri b() {
            return this.d;
        }

        @Override // o.KL.g
        public ContentInfo c() {
            return null;
        }

        @Override // o.KL.g
        public ClipData d() {
            return this.a;
        }

        @Override // o.KL.g
        public Bundle getExtras() {
            return this.e;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(KL.k(this.b));
            sb.append(", flags=");
            sb.append(KL.b(this.c));
            String str2 = "";
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + C9811tl1.d;
            }
            sb.append(str);
            if (this.e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface i {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface j {
    }

    public KL(g gVar) {
        this.a = gVar;
    }

    public static ClipData a(ClipDescription clipDescription, List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i2 = 1; i2 < list.size(); i2++) {
            clipData.addItem(list.get(i2));
        }
        return clipData;
    }

    public static String b(int i2) {
        if ((i2 & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i2);
    }

    public static Pair<ClipData, ClipData> h(ClipData clipData, LF1<ClipData.Item> lf1) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
            ClipData.Item itemAt = clipData.getItemAt(i2);
            if (lf1.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    public static Pair<ContentInfo, ContentInfo> i(ContentInfo contentInfo, Predicate<ClipData.Item> predicate) {
        return a.a(contentInfo, predicate);
    }

    public static String k(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return String.valueOf(i2);
                            }
                            return "SOURCE_PROCESS_TEXT";
                        }
                        return "SOURCE_AUTOFILL";
                    }
                    return "SOURCE_DRAG_AND_DROP";
                }
                return "SOURCE_INPUT_METHOD";
            }
            return "SOURCE_CLIPBOARD";
        }
        return "SOURCE_APP";
    }

    public static KL m(ContentInfo contentInfo) {
        return new KL(new f(contentInfo));
    }

    public ClipData c() {
        return this.a.d();
    }

    public Bundle d() {
        return this.a.getExtras();
    }

    public int e() {
        return this.a.Y();
    }

    public Uri f() {
        return this.a.b();
    }

    public int g() {
        return this.a.a();
    }

    public Pair<KL, KL> j(LF1<ClipData.Item> lf1) {
        KL kl;
        ClipData d2 = this.a.d();
        KL kl2 = null;
        if (d2.getItemCount() == 1) {
            boolean test = lf1.test(d2.getItemAt(0));
            if (test) {
                kl = this;
            } else {
                kl = null;
            }
            if (!test) {
                kl2 = this;
            }
            return Pair.create(kl, kl2);
        }
        Pair<ClipData, ClipData> h2 = h(d2, lf1);
        if (h2.first == null) {
            return Pair.create(null, this);
        }
        if (h2.second == null) {
            return Pair.create(this, null);
        }
        return Pair.create(new b(this).b((ClipData) h2.first).a(), new b(this).b((ClipData) h2.second).a());
    }

    public ContentInfo l() {
        ContentInfo c2 = this.a.c();
        Objects.requireNonNull(c2);
        return IL.a(c2);
    }

    public String toString() {
        return this.a.toString();
    }

    /* loaded from: classes.dex */
    public static final class c implements d {
        public final ContentInfo.Builder a;

        public c(ClipData clipData, int i) {
            this.a = RL.a(clipData, i);
        }

        @Override // o.KL.d
        public void a(int i) {
            this.a.setSource(i);
        }

        @Override // o.KL.d
        public void b(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // o.KL.d
        public KL build() {
            ContentInfo build;
            build = this.a.build();
            return new KL(new f(build));
        }

        @Override // o.KL.d
        public void c(ClipData clipData) {
            this.a.setClip(clipData);
        }

        @Override // o.KL.d
        public void i(int i) {
            this.a.setFlags(i);
        }

        @Override // o.KL.d
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        public c(KL kl) {
            TL.a();
            this.a = SL.a(kl.l());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements d {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        public e(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // o.KL.d
        public void a(int i) {
            this.b = i;
        }

        @Override // o.KL.d
        public void b(Uri uri) {
            this.d = uri;
        }

        @Override // o.KL.d
        public KL build() {
            return new KL(new h(this));
        }

        @Override // o.KL.d
        public void c(ClipData clipData) {
            this.a = clipData;
        }

        @Override // o.KL.d
        public void i(int i) {
            this.c = i;
        }

        @Override // o.KL.d
        public void setExtras(Bundle bundle) {
            this.e = bundle;
        }

        public e(KL kl) {
            this.a = kl.c();
            this.b = kl.g();
            this.c = kl.e();
            this.d = kl.f();
            this.e = kl.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final d a;

        public b(KL kl) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new c(kl);
            } else {
                this.a = new e(kl);
            }
        }

        public KL a() {
            return this.a.build();
        }

        public b b(ClipData clipData) {
            this.a.c(clipData);
            return this;
        }

        public b c(Bundle bundle) {
            this.a.setExtras(bundle);
            return this;
        }

        public b d(int i) {
            this.a.i(i);
            return this;
        }

        public b e(Uri uri) {
            this.a.b(uri);
            return this;
        }

        public b f(int i) {
            this.a.a(i);
            return this;
        }

        public b(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new c(clipData, i);
            } else {
                this.a = new e(clipData, i);
            }
        }
    }
}
