package o;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

@InterfaceC8303na2({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,401:1\n1803#2,3:402\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:402,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CQ1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class a<T> implements HA0<T, Boolean> {
        public final /* synthetic */ int X;

        public a(int i) {
            this.X = i;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        @Override // o.HA0
        /* renamed from: c */
        public final Boolean invoke(Enum r3) {
            boolean z;
            InterfaceC4073Qu0 interfaceC4073Qu0 = (InterfaceC4073Qu0) r3;
            if ((this.X & interfaceC4073Qu0.e()) == interfaceC4073Qu0.getValue()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final /* synthetic */ P81 a(Matcher matcher, int i, CharSequence charSequence) {
        return f(matcher, i, charSequence);
    }

    public static final /* synthetic */ P81 b(Matcher matcher, CharSequence charSequence) {
        return h(matcher, charSequence);
    }

    public static final /* synthetic */ int e(Iterable iterable) {
        return k(iterable);
    }

    public static final P81 f(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new Q81(matcher, charSequence);
    }

    public static final /* synthetic */ <T extends Enum<T> & InterfaceC4073Qu0> Set<T> g(int i) {
        C6562gT0.y(4, "T");
        EnumSet allOf = EnumSet.allOf(Enum.class);
        C6562gT0.m(allOf);
        C6562gT0.w();
        C9444sF.Q0(allOf, new a(i));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        C6562gT0.o(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    public static final P81 h(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new Q81(matcher, charSequence);
    }

    public static final C11197zR0 i(MatchResult matchResult) {
        return C5075aO1.W1(matchResult.start(), matchResult.end());
    }

    public static final C11197zR0 j(MatchResult matchResult, int i) {
        return C5075aO1.W1(matchResult.start(i), matchResult.end(i));
    }

    public static final int k(Iterable<? extends InterfaceC4073Qu0> iterable) {
        int i = 0;
        for (InterfaceC4073Qu0 interfaceC4073Qu0 : iterable) {
            i |= interfaceC4073Qu0.getValue();
        }
        return i;
    }
}
