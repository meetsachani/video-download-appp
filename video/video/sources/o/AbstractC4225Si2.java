package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.3")
/* renamed from: o.Si2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4225Si2 extends KM implements InterfaceC6976iB0<Object>, InterfaceC4028Qi2 {
    public final int Y0;

    public AbstractC4225Si2(int i, @Nullable HM<Object> hm) {
        super(hm);
        this.Y0 = i;
    }

    @Override // o.InterfaceC6976iB0
    public int getArity() {
        return this.Y0;
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public String toString() {
        if (A() == null) {
            String w = C6551gQ1.w(this);
            C6562gT0.o(w, "renderLambdaToString(...)");
            return w;
        }
        return super.toString();
    }

    public AbstractC4225Si2(int i) {
        this(i, null);
    }
}
