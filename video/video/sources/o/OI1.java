package o;

import java.util.List;

/* loaded from: classes.dex */
public interface OI1 {
    static OI1 a() {
        if (C6771hK2.c0.d()) {
            return PI1.a();
        }
        throw C6771hK2.a();
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    EI1 getOrCreateProfile(String str);

    EI1 getProfile(String str);
}
