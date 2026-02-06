package o;

/* renamed from: o.a40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4994a40 {
    public static final AbstractC4994a40 a = new a();
    public static final AbstractC4994a40 b = new b();
    public static final AbstractC4994a40 c = new c();
    public static final AbstractC4994a40 d = new d();
    public static final AbstractC4994a40 e = new e();

    /* renamed from: o.a40$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4994a40 {
        @Override // o.AbstractC4994a40
        public boolean a() {
            return true;
        }

        @Override // o.AbstractC4994a40
        public boolean b() {
            return true;
        }

        @Override // o.AbstractC4994a40
        public boolean c(GU gu) {
            if (gu == GU.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4994a40
        public boolean d(boolean z, GU gu, EnumC9770tb0 enumC9770tb0) {
            if (gu != GU.RESOURCE_DISK_CACHE && gu != GU.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.a40$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC4994a40 {
        @Override // o.AbstractC4994a40
        public boolean a() {
            return false;
        }

        @Override // o.AbstractC4994a40
        public boolean b() {
            return false;
        }

        @Override // o.AbstractC4994a40
        public boolean c(GU gu) {
            return false;
        }

        @Override // o.AbstractC4994a40
        public boolean d(boolean z, GU gu, EnumC9770tb0 enumC9770tb0) {
            return false;
        }
    }

    /* renamed from: o.a40$c */
    /* loaded from: classes.dex */
    public class c extends AbstractC4994a40 {
        @Override // o.AbstractC4994a40
        public boolean a() {
            return true;
        }

        @Override // o.AbstractC4994a40
        public boolean b() {
            return false;
        }

        @Override // o.AbstractC4994a40
        public boolean c(GU gu) {
            if (gu != GU.DATA_DISK_CACHE && gu != GU.MEMORY_CACHE) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4994a40
        public boolean d(boolean z, GU gu, EnumC9770tb0 enumC9770tb0) {
            return false;
        }
    }

    /* renamed from: o.a40$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC4994a40 {
        @Override // o.AbstractC4994a40
        public boolean a() {
            return false;
        }

        @Override // o.AbstractC4994a40
        public boolean b() {
            return true;
        }

        @Override // o.AbstractC4994a40
        public boolean c(GU gu) {
            return false;
        }

        @Override // o.AbstractC4994a40
        public boolean d(boolean z, GU gu, EnumC9770tb0 enumC9770tb0) {
            if (gu != GU.RESOURCE_DISK_CACHE && gu != GU.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.a40$e */
    /* loaded from: classes.dex */
    public class e extends AbstractC4994a40 {
        @Override // o.AbstractC4994a40
        public boolean a() {
            return true;
        }

        @Override // o.AbstractC4994a40
        public boolean b() {
            return true;
        }

        @Override // o.AbstractC4994a40
        public boolean c(GU gu) {
            if (gu == GU.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4994a40
        public boolean d(boolean z, GU gu, EnumC9770tb0 enumC9770tb0) {
            if (((z && gu == GU.DATA_DISK_CACHE) || gu == GU.LOCAL) && enumC9770tb0 == EnumC9770tb0.TRANSFORMED) {
                return true;
            }
            return false;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(GU gu);

    public abstract boolean d(boolean z, GU gu, EnumC9770tb0 enumC9770tb0);
}
