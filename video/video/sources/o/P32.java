package o;

import com.facebook.internal.InterfaceC2365j;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public enum P32 implements InterfaceC2365j {
    SHARE_STORY_ASSET(com.facebook.internal.Z.E);
    
    public final int X;

    P32(int i) {
        this.X = i;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static P32[] valuesCustom() {
        P32[] valuesCustom = values();
        return (P32[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // com.facebook.internal.InterfaceC2365j
    public int e() {
        return this.X;
    }

    @Override // com.facebook.internal.InterfaceC2365j
    @NotNull
    public String g() {
        return com.facebook.internal.Z.p0;
    }
}
