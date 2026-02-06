package o;

import java.util.Set;
import o.C7255jK2;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public class YJ2 {
    public final WebSettingsBoundaryInterface a;

    public YJ2(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.a = webSettingsBoundaryInterface;
    }

    public int a() {
        return this.a.getAttributionBehavior();
    }

    public int b() {
        return this.a.getDisabledActionModeMenuItems();
    }

    public boolean c() {
        return this.a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int d() {
        return this.a.getForceDark();
    }

    public int e() {
        return this.a.getForceDarkBehavior();
    }

    public boolean f() {
        return this.a.getOffscreenPreRaster();
    }

    public Set<String> g() {
        return this.a.getRequestedWithHeaderOriginAllowList();
    }

    public boolean h() {
        return this.a.getSafeBrowsingEnabled();
    }

    public C8704pD2 i() {
        return C8947qD2.c(this.a.getUserAgentMetadataMap());
    }

    public C7255jK2 j() {
        return new C7255jK2.a(this.a.getWebViewMediaIntegrityApiDefaultStatus()).e(this.a.getWebViewMediaIntegrityApiOverrideRules()).d();
    }

    public boolean k() {
        return this.a.isAlgorithmicDarkeningAllowed();
    }

    public void l(boolean z) {
        this.a.setAlgorithmicDarkeningAllowed(z);
    }

    public void m(int i) {
        this.a.setAttributionBehavior(i);
    }

    public void n(int i) {
        this.a.setDisabledActionModeMenuItems(i);
    }

    public void o(boolean z) {
        this.a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
    }

    public void p(int i) {
        this.a.setForceDark(i);
    }

    public void q(int i) {
        this.a.setForceDarkBehavior(i);
    }

    public void r(boolean z) {
        this.a.setOffscreenPreRaster(z);
    }

    public void s(Set<String> set) {
        this.a.setRequestedWithHeaderOriginAllowList(set);
    }

    public void t(boolean z) {
        this.a.setSafeBrowsingEnabled(z);
    }

    public void u(C8704pD2 c8704pD2) {
        this.a.setUserAgentMetadataFromMap(C8947qD2.a(c8704pD2));
    }

    public void v(C7255jK2 c7255jK2) {
        this.a.setWebViewMediaIntegrityApiStatus(c7255jK2.a(), c7255jK2.b());
    }
}
