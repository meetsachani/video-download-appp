package o;

import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* loaded from: classes.dex */
public class PI1 implements OI1 {
    public static OI1 b;
    public final ProfileStoreBoundaryInterface a;

    public PI1(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.a = profileStoreBoundaryInterface;
    }

    public static OI1 a() {
        if (b == null) {
            b = new PI1(C7014iK2.d().getProfileStore());
        }
        return b;
    }

    @Override // o.OI1
    public boolean deleteProfile(String str) throws IllegalStateException {
        if (C6771hK2.c0.d()) {
            return this.a.deleteProfile(str);
        }
        throw C6771hK2.a();
    }

    @Override // o.OI1
    public List<String> getAllProfileNames() {
        if (C6771hK2.c0.d()) {
            return this.a.getAllProfileNames();
        }
        throw C6771hK2.a();
    }

    @Override // o.OI1
    public EI1 getOrCreateProfile(String str) {
        if (C6771hK2.c0.d()) {
            return new FI1((ProfileBoundaryInterface) C7128ip.a(ProfileBoundaryInterface.class, this.a.getOrCreateProfile(str)));
        }
        throw C6771hK2.a();
    }

    @Override // o.OI1
    public EI1 getProfile(String str) {
        if (C6771hK2.c0.d()) {
            InvocationHandler profile = this.a.getProfile(str);
            if (profile != null) {
                return new FI1((ProfileBoundaryInterface) C7128ip.a(ProfileBoundaryInterface.class, profile));
            }
            return null;
        }
        throw C6771hK2.a();
    }

    public PI1() {
        this.a = null;
    }
}
