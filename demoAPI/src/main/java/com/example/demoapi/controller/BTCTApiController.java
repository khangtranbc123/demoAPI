package com.example.demoapi.controller;

import com.example.demoapi.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/OCREcmAPI/services/BCTCService")
public class BTCTApiController {

    @PostMapping("/GetBCTC")
    public ResponseEntity<TT113> getDetail(@RequestHeader(value = "authorize") String value,
                                            @RequestBody Batch batch){
        String auth = "IM80gqkhsVRloftQcJvajg==";
        String batchId = "3";

        if(auth.equals(value) && batchId.equals(batch.getBatchID())){
            TT113 tt113 = new TT113();
            DauKy dauKy = new DauKy();
            dauKy.setHangTonKho141(null);
            dauKy.setNguyenGia151(null);
            dauKy.setNguyenGia158(null);
            dauKy.setXdcbdoDang210(null);
            dauKy.setGiaVonBanHang(null);
            dauKy.setTaiSanKhac211(null);
            dauKy.setBdsdauTu154(null);
            dauKy.setTaiSanKhac213(null);
            dauKy.setNoPhaiTra300(null);
            dauKy.setHangTonKho140(null);
            dauKy.setCoPhieuQuy414(null);
            dauKy.setThueTNDNDaNop(null);
            dauKy.setChiPhiKhac(null);
            dauKy.setTienTonDauKy(null);
            dauKy.setThuNhapKhac(null);
            dauKy.setLoiNhuanKhac(null);
            dauKy.setTienMuaTSCD(null);
            dauKy.setTienTonCuoiKy(null);
            dauKy.setLcttuHDDT(null);
            dauKy.setLnthuanTuHDKD(null);
            dauKy.setChiPhiBanHang(null);
            dauKy.setLuuChuyenTienThuanTuHoatDongTaiChinh(null);
            dauKy.setAnhHuongThayDoiTyGiaHoiDoaiQuyDoiNgoaiTe(null);
            dauKy.setTienThuHoiChoVayBanLaiCongCuNoDVK(null);
            dauKy.setThuLaiTienChoVayCoTucVaLNDuocChia(null);
            dauKy.setTienThuTuPhatHanhCPNhanVonGopCSH(null);
            dauKy.setPhaiThuCuaKhachHang131(null);
            dauKy.setGiaTriHaoMonLuyKe159(null);
            dauKy.setNguoiMuaTraTienTruoc312(null);
            dauKy.setVonChuSoHuu400(null);
            dauKy.setVonDauTuCuaCSH411(null);
            dauKy.setPhaiTraNguoiBan311(null);
            dauKy.setPhaiThuKhac134(null);
            dauKy.setThueVaCacKhoanPhaiNopNN313(null);
            dauKy.setTaiSanThieuChoXuLy135(null);
            dauKy.setDuPhongPhaiThuKhoDoi139(null);
            dauKy.setGiaTriHaoMonLuyKe152(null);
            dauKy.setThueGTGTDuocKhauTru212(null);
            dauKy.setTienVaCacKhoanTuongDuong110(null);
            dauKy.setDuPhongPhaiTra318(null);
            dauKy.setDauTuTaiChinh111(null);
            dauKy.setTraTruocChoNguoiBan132(null);
            dauKy.setChungKhoanKinhDoanh112(null);
            dauKy.setDauTuGopVonVaoDVK121(null);
            dauKy.setDauTuNamGiuDenNgayDaoHan120(null);
            dauKy.setQuyPhatTrienKHCN320(null);
            dauKy.setTaiSanCoDinh150(null);
            dauKy.setTongConTaiSan200(null);
            dauKy.setDuPhongTonThatDTTC129(null);
            dauKy.setPhaiTraNguoiLaoDong314(null);
            dauKy.setPhaiTraKhac315(null);
            dauKy.setVayVaNoThueTC316(null);
            dauKy.setVonKinhDoanhDVTrucThuoc133(null);
            dauKy.setPhaiTraNoiBo317(null);
            dauKy.setQuyKhenThuongPhucLoi319(null);
            dauKy.setCacKhoanPhaiThu130(null);
            dauKy.setDuPhongGiamGiaHTK149(null);
            dauKy.setTongCongNguonVon500(null);
            dauKy.setCacQuyThuocVonCSH416(null);
            dauKy.setChiPhiLaiVay_KQKD(null);
            dauKy.setCacKhoanDuPhong(null);
            dauKy.setCacKhoanDieuChinhKhac(null);
            dauKy.setThangDuVonCoPhan412(null);
            dauKy.setLngopVeBanHangVaCungCapDV(null);
            dauKy.setChenhLechTyGiaHoiDoai415(null);
            dauKy.setLoiNhuanTruocThue(null);
            dauKy.setTangGiamHangTonKho(null);
            dauKy.setChiPhiQuanLyDoanhNghiep(null);
            dauKy.setTongLoiNhuanKeToanTruocThue(null);
            dauKy.setLoiNhuanSauThueTNDN(null);
            dauKy.setLoiNhuanSauThueCuaCongTyMe(null);
            dauKy.setChiPhiLaiVay_GianTiep(null);
            dauKy.setTangGiamCacKhoanPhaiThu(null);
            dauKy.setTangGiamCacKhoanPhaiTra(null);
            dauKy.setDtthuanVeBanHangVaCungCapDV(null);
            dauKy.setTangGiamChiPhiTraTruoc(null);
            dauKy.setKhauHaoTaiSanCoDinh(null);
            dauKy.setDoanhThuHoatDongTaiChinh(null);
            dauKy.setLoiIchCuaCoDongKhongKiemSoat(null);
            dauKy.setDieuChinhChoCacKhoan(null);
            dauKy.setCacKhoanGiamTruDoanhThu(null);
            dauKy.setLaiCoBanTrenCoPhieu(null);
            dauKy.setLaiLoTuHoatDongDauTu(null);
            dauKy.setLaiLoCongTyLKLD(null);
            dauKy.setDoanhThuBanHangVaCungCapDV(null);
            dauKy.setChiPhiHoatDongTaiChinh(null);
            dauKy.setLaiSuyGiamTrenCoPhieu(null);
            dauKy.setChiPhiThueTNDNHienHanh(null);
            dauKy.setChiPhiThueTNDNHoanLai(null);
            dauKy.setVonKhacCuaCSH413(null);
            dauKy.setCoTucLoiNhuanTraChoCSH(null);
            dauKy.setLctthuanTuHDTC(null);
            dauKy.setAnhHuongCuaThayDoiTyGia(null);
            dauKy.setTienTraNoGocThueTC(null);
            dauKy.setLctthuanTrongKy(null);
            dauKy.setTienChiTraNoGocVay(null);
            dauKy.setTienThuKhacTuHDKD(null);
            dauKy.setThueThuNhapDoanhNghiepDaNop(null);
            dauKy.setTienChiKhacChoHDKD(null);
            dauKy.setTienLaiVayDaTra_LCTT_GianTiep(null);
            dauKy.setTienVaTuongDuongTienCuoiKy(null);
            dauKy.setThuTienBanHang(null);
            dauKy.setCoTucLoiNhuanDaTraChoChuSoHuu(null);
            dauKy.setTienChiChoVayMuaCongCuNoDVK(null);
            dauKy.setLctthuanTuHDKD(null);
            dauKy.setTienChiTraNoThueTaiChinh(null);
            dauKy.setTangGiamChungKhoanKinhDoanh(null);
            dauKy.setTienTraChoNguoiCungCapHHDV(null);
            dauKy.setTienTraChoNguoiLaoDong(null);
            dauKy.setTienLaiVayDaTra_LCTT_TrucTiep(null);
            dauKy.setTienChiTraVonGopChoCSH(null);
            dauKy.setTienThuThanhLyNhuongBanTSCD(null);
            dauKy.setTienVayNganHanDaiHanNhanDuoc(null);
            dauKy.setTienChiDauTuGopVonVaoDVK(null);
            dauKy.setTienThuHoiDauTuVonVaoDVK(null);
            dauKy.setTienChiVonGopChoCSH(null);
            dauKy.setTienTraNoGocVay(null);
            dauKy.setTienThuTuDiVay(null);
            dauKy.setLuuChuyenTienThuanTrongKy(null);
            dauKy.setTienVaTuongDuongTienDauKy(null);
            dauKy.setLoiNhuanTuHoatDongKinhDoanhTruocThayDoiVonLuuDong(null);
            dauKy.setTienThuHoiDauTuGopVonVaoDonViKhac(null);
            dauKy.setTienChiKhacChoHoatDongKinhDoanh(null);
            dauKy.setTienThuTuThanhLyNhuongBanTSCDVaTSDaiHanKhac(null);
            dauKy.setTienThuKhacTuHoatDongKinhDoanh(null);
            dauKy.setLuuChuyenTienThuanTuHoatDongDauTu(null);
            dauKy.setTienThuTuPhatHanhCoPhieuNhanVonGopCuaChuSoHuu(null);
            dauKy.setTienThuLaiChoVayCoTucVaLoiNhuanDuocChia(null);
            dauKy.setLoiNhuanSauThueChuaPhanPhoi417(null);
            dauKy.setTienChiChoVayMuaCacCongCuNoCuaDonViKhac(null);
            dauKy.setTienThuHoiChoVayBanLaiCacCongCuNoCuaDonViKhac(null);
            dauKy.setLuuChuyenTienThuanTuHoatDongKinhDoanh(null);
            dauKy.setTienChiDeMuaSamXayDungTSCDVaTSDaiHanKhac(null);
            dauKy.setTienChiDauTuGopVonVaoDonViKhac(null);
            dauKy.setLaiLoChenhLechTyGiaHoiDoaiChuaThucHien(null);
            tt113.setDauKy(dauKy);
            tt113.setCode("00");

            Batch batch1 = new Batch();
            batch1.setBatchID(3);
            batch1.setBieuMauBCTC("TT133");
            batch1.setLoaiBCTC("Thuế");
            batch1.setDonViTinh("Đồng");
            batch1.setNguonDuLieu("Bên thứ 3 cung cấp");
            batch1.setNamBCTC("2019");
            tt113.setBatch(batch1);

            CuoiKy cuoiKy = new CuoiKy();
            cuoiKy.setThuNhapKhac_(200000.0);
            cuoiKy.setChiPhiKhac_(11);
            cuoiKy.setBdsdauTu154_(11);
            cuoiKy.setNguyenGia158_(11);
            cuoiKy.setNoPhaiTra300_(11);
            cuoiKy.setNguyenGia151_(11);
            cuoiKy.setTienTonDauKy_(11);
            cuoiKy.setTienMuaTSCD_(11);
            cuoiKy.setLcttuHDDT_(11);
            cuoiKy.setLoiNhuanKhac_(11);
            cuoiKy.setDauTuTaiChinh111_(11);
            cuoiKy.setGiaTriHaoMonLuyKe159_(11);
            cuoiKy.setPhaiTraNoiBo317_(11);
            cuoiKy.setVayVaNoThueTC316_(11);
            cuoiKy.setDuPhongPhaiTra318_(11);
            cuoiKy.setTaiSanCoDinh150_(11);
            cuoiKy.setDuPhongPhaiThuKhoDoi139_(11);
            cuoiKy.setHangTonKho141_(11);
            cuoiKy.setXdcbdoDang210_(11);
            cuoiKy.setDauTuNamGiuDenNgayDaoHan120_(11);
            cuoiKy.setDauTuGopVonVaoDVK121_(11);
            cuoiKy.setThueGTGTDuocKhauTru212_(11);
            cuoiKy.setVonDauTuCuaCSH411_(11);
            cuoiKy.setThangDuVonCoPhan412_(11);
            cuoiKy.setTraTruocChoNguoiBan132_(11);
            cuoiKy.setNguoiMuaTraTienTruoc312_(11);
            cuoiKy.setTienVaCacKhoanTuongDuong110_(11);
            cuoiKy.setTaiSanThieuChoXuLy135_(11);
            cuoiKy.setPhaiTraNguoiBan311_(11);
            cuoiKy.setDuPhongGiamGiaHTK149_(11);
            cuoiKy.setTaiSanKhac211_(11);
            cuoiKy.setVonKinhDoanhDVTrucThuoc133_(11);
            cuoiKy.setHangTonKho140_(11);
            cuoiKy.setThueVaCacKhoanPhaiNopNN313_(11);
            cuoiKy.setDuPhongTonThatDTTC129_(11);
            cuoiKy.setPhaiThuCuaKhachHang131_(11);
            cuoiKy.setChungKhoanKinhDoanh112_(11);
            cuoiKy.setPhaiTraNguoiLaoDong314_(11);
            cuoiKy.setTaiSanKhac213_(11);
            cuoiKy.setPhaiTraKhac315_(11);
            cuoiKy.setQuyKhenThuongPhucLoi319_(11);
            cuoiKy.setQuyPhatTrienKHCN320_(11);
            cuoiKy.setVonChuSoHuu400_(11);
            cuoiKy.setTongConTaiSan200_(11);
            cuoiKy.setPhaiThuKhac134_(11);
            cuoiKy.setGiaTriHaoMonLuyKe152_(11);
            cuoiKy.setCacKhoanPhaiThu130_(11);
            cuoiKy.setChenhLechTyGiaHoiDoai415_(11);
            cuoiKy.setChiPhiThueTNDNHienHanh_(11);
            cuoiKy.setChiPhiHoatDongTaiChinh_(11);
            cuoiKy.setDtthuanVeBanHangVaCungCapDV_(11);
            cuoiKy.setGiaVonBanhang_(11);
            cuoiKy.setChiPhiLaiVay_LCTT_GianTiep_(11);
            cuoiKy.setCoPhieuQuy414_(11);
            cuoiKy.setCacKhoanDieuChinhKhac_(11);
            cuoiKy.setTangGiamHangTonKho_(11);
            cuoiKy.setCacKhoanDuPhong_(11);
            cuoiKy.setTangGiamCacKhoanPhaiThu_(11);
            cuoiKy.setTangGiamCacKhoanPhaiTra_(11);
            cuoiKy.setChiPhiThueTNDNHoanLai_(11);
            cuoiKy.setLoiIchCuaCoDongKhongKiemSoat_(11);
            cuoiKy.setLoiNhuanSauThueTNDN_(11);
            cuoiKy.setLnthuanTuHDKD_(11);
            cuoiKy.setLoiNhuanTruocThue_(11);
            cuoiKy.setLaiSuyGiamTrenCoPhieu_(11);
            cuoiKy.setCacKhoanGiamTruDoanhThu_(11);
            cuoiKy.setChiPhiQuanLyDoanhNghiep_(11);
            cuoiKy.setLoiNhuanSauThueCuaCongTyMe_(11);
            cuoiKy.setLngopVeBanHangVaCungCapDV_(11);
            cuoiKy.setCacQuyThuocVonCSH416_(11);
            cuoiKy.setVonKhacCuaCSH413_(11);
            cuoiKy.setTongLoiNhuanKeToanTruocThue_(11);
            cuoiKy.setLaiCoBanTrenCoPhieu_(11);
            cuoiKy.setDoanhThuBanHangVaCungCapDV_(11);
            cuoiKy.setDieuChinhChoCacKhoan_(11);
            cuoiKy.setChiPhiLaiVay_KQKD_(11);
            cuoiKy.setKhauHaoTaiSanCoDinh_(11);
            cuoiKy.setLaiLoTuHoatDongDauTu_(11);
            cuoiKy.setTongCongNguonVon500_(11);
            cuoiKy.setDoanhThuHoatDongTaiChinh_(11);
            cuoiKy.setChiPhiBanHang_(11);
            cuoiKy.setLaiLoCongTyLKLD_(11);
            cuoiKy.setThueTNDNDaNop_(11);
            cuoiKy.setLctthuanTuHDKD_(11);
            cuoiKy.setAnhHuongCuaThayDoiTyGia_(11);
            cuoiKy.setTienChiDauTuGopVonVaoDVK_(11);
            cuoiKy.setTienVaTuongDuongTienDauKy_(11);
            cuoiKy.setTangGiamChungKhoanKinhDoanh_(11);
            cuoiKy.setTangGiamChiPhiTraTruoc_(11);
            cuoiKy.setTienVaTuongDuongTienCuoiKy_(11);
            cuoiKy.setTienThuHoiDauTuVonVaoDVK_(11);
            cuoiKy.setTienChiVonGopChoCSH_(11);
            cuoiKy.setThueThuNhapDoanhNghiepDaNop_(11);
            cuoiKy.setTienThuTuDiVay_(11);
            cuoiKy.setTienTraChoNguoiCungCapHHDV_(11);
            cuoiKy.setTienTraNoGocVay_(11);
            cuoiKy.setTienTraNoGocThueTC_(11);
            cuoiKy.setLctthuanTuHDTC_(11);
            cuoiKy.setTienTonCuoiKy_(11);
            cuoiKy.setTienChiTraNoThueTaiChinh_(11);
            cuoiKy.setTienTraChoNguoiLaoDong_(11);
            cuoiKy.setTienChiTraNoGocVay_(11);
            cuoiKy.setTienChiKhacChoHDKD_(11);
            cuoiKy.setTienThuThanhLyNhuongBanTSCD_(11);
            cuoiKy.setTienChiChoVayMuaCongCuNoDVK_(11);
            cuoiKy.setThuTienBanHang_(11);
            cuoiKy.setCoTucLoiNhuanTraChoCSH_(11);
            cuoiKy.setTienThuKhacTuHDKD_(11);
            cuoiKy.setLctthuanTrongKy_(11);
            cuoiKy.setTienChiTraVonGopChoCSH_(11);
            cuoiKy.setLuuChuyenTienThuanTrongKy_(11);
            cuoiKy.setTienVayNganHanDaiHanNhanDuoc_(11);
            cuoiKy.setLoiNhuanSauThueChuaPhanPhoi417_(11);
            cuoiKy.setTienThuKhacTuHoatDongKinhDoanh_(11);
            cuoiKy.setTienChiKhacChoHoatDongKinhDoanh_(11);
            cuoiKy.setLuuChuyenTienThuanTuHoatDongKinhDoanh_(11);
            cuoiKy.setLaiLoChenhLechTyGiaHoiDoaiChuaThucHien_(11);
            cuoiKy.setTienThuTuThanhLyNhuongBanTSCDVaTSDaiHanKhac_(11);
            cuoiKy.setTienLaiVayDaTra_LCTT_GianTiep_(11);
            cuoiKy.setLoiNhuanTuHoatDongKinhDoanhTruocThayDoiVLD_(11);
            cuoiKy.setTienChiDeMuaSamXayDungTSCDVaTSDaiHanKhac_(11);
            cuoiKy.setTienChiChoVayMuaCacCongCuNoCuaDonViKhac_(11);
            cuoiKy.setTienThuLaiChoVayCoTucVaLoiNhuanDuocChia_(11);
            cuoiKy.setTienThuTuPhatHanhCoPhieuNhanVonGopCuaCSH_(11);
            cuoiKy.setLuuChuyenTienThuanTuHoatDongTaiChinh_(11);
            cuoiKy.setTienLaiVayDaTra_LCTT_TrucTiep_(11);
            cuoiKy.setTienThuHoiChoVayBanLaiCongCuNoDVK_(11);
            cuoiKy.setTienChiDauTuGopVonVaoDonViKhac_(11);
            cuoiKy.setThuLaiTienChoVayCoTucVaLNDuocChia_(11);
            cuoiKy.setTienThuHoiChoVayBanLaiCacCongCuNoCuaDVK_(11);
            cuoiKy.setCoTucLoiNhuanDaTraChoChuSoHuu_(11);
            cuoiKy.setTienThuHoiDauTuGopVonVaoDonViKhac_(11);
            cuoiKy.setAnhHuongThayDoiTyGiaHoiDoaiQuyDoiNgoaiTe_(11);
            cuoiKy.setLuuChuyenTienThuanTuHoatDongDauTu_(11);
            cuoiKy.setTienThuTuPhatHanhCPNhanVonGopCSH_(123555.0);
            tt113.setCuoiKy(cuoiKy);
            return new ResponseEntity<>(tt113, HttpStatus.OK);
        }else {
            System.out.println("sai");
            return null;
        }


    }

    @PostMapping("GetBCTCDetail")
    public ResponseEntity<?> getDetailBCTC(@RequestHeader(value = "authorize") String value,
                                           @RequestBody Batch batch) {
        String auth = "IM80gqkhsVRloftQcJvajg==";
        int batchId = 3;
        int batchId1 = 10193;

        if (auth.equals(value) && batchId==batch.getBatchID()) {

            TT113 tt113 = new TT113();
            DauKy dauKy = new DauKy();
            tt113.setCode("00");
            dauKy.setHangTonKho141(null);
            dauKy.setNguyenGia151(null);
            dauKy.setNguyenGia158(null);
            dauKy.setXdcbdoDang210(null);
            dauKy.setGiaVonBanHang(null);
            dauKy.setTaiSanKhac211(null);
            dauKy.setBdsdauTu154(null);
            dauKy.setTaiSanKhac213(null);
            dauKy.setNoPhaiTra300(null);
            dauKy.setHangTonKho140(null);
            dauKy.setCoPhieuQuy414(null);
            dauKy.setThueTNDNDaNop(null);
            dauKy.setChiPhiKhac(null);
            dauKy.setTienTonDauKy(null);
            dauKy.setThuNhapKhac(null);
            dauKy.setLoiNhuanKhac(null);
            dauKy.setTienMuaTSCD(null);
            dauKy.setTienTonCuoiKy(null);
            dauKy.setLcttuHDDT(null);
            dauKy.setLnthuanTuHDKD(null);
            dauKy.setChiPhiBanHang(null);
            dauKy.setLuuChuyenTienThuanTuHoatDongTaiChinh(null);
            dauKy.setAnhHuongThayDoiTyGiaHoiDoaiQuyDoiNgoaiTe(null);
            dauKy.setTienThuHoiChoVayBanLaiCongCuNoDVK(null);
            dauKy.setThuLaiTienChoVayCoTucVaLNDuocChia(null);
            dauKy.setTienThuTuPhatHanhCPNhanVonGopCSH(null);
            dauKy.setPhaiThuCuaKhachHang131(null);
            dauKy.setGiaTriHaoMonLuyKe159(null);
            dauKy.setNguoiMuaTraTienTruoc312(null);
            dauKy.setVonChuSoHuu400(null);
            dauKy.setVonDauTuCuaCSH411(null);
            dauKy.setPhaiTraNguoiBan311(null);
            dauKy.setPhaiThuKhac134(null);
            dauKy.setThueVaCacKhoanPhaiNopNN313(null);
            dauKy.setTaiSanThieuChoXuLy135(null);
            dauKy.setDuPhongPhaiThuKhoDoi139(null);
            dauKy.setGiaTriHaoMonLuyKe152(null);
            dauKy.setThueGTGTDuocKhauTru212(null);
            dauKy.setTienVaCacKhoanTuongDuong110(null);
            dauKy.setDuPhongPhaiTra318(null);
            dauKy.setDauTuTaiChinh111(null);
            dauKy.setTraTruocChoNguoiBan132(null);
            dauKy.setChungKhoanKinhDoanh112(null);
            dauKy.setDauTuGopVonVaoDVK121(null);
            dauKy.setDauTuNamGiuDenNgayDaoHan120(null);
            dauKy.setQuyPhatTrienKHCN320(null);
            dauKy.setTaiSanCoDinh150(null);
            dauKy.setTongConTaiSan200(null);
            dauKy.setDuPhongTonThatDTTC129(null);
            dauKy.setPhaiTraNguoiLaoDong314(null);
            dauKy.setPhaiTraKhac315(null);
            dauKy.setVayVaNoThueTC316(null);
            dauKy.setVonKinhDoanhDVTrucThuoc133(null);
            dauKy.setPhaiTraNoiBo317(null);
            dauKy.setQuyKhenThuongPhucLoi319(null);
            dauKy.setCacKhoanPhaiThu130(null);
            dauKy.setDuPhongGiamGiaHTK149(null);
            dauKy.setTongCongNguonVon500(null);
            dauKy.setCacQuyThuocVonCSH416(null);
            dauKy.setChiPhiLaiVay_KQKD(null);
            dauKy.setCacKhoanDuPhong(null);
            dauKy.setCacKhoanDieuChinhKhac(null);
            dauKy.setThangDuVonCoPhan412(null);
            dauKy.setLngopVeBanHangVaCungCapDV(null);
            dauKy.setChenhLechTyGiaHoiDoai415(null);
            dauKy.setLoiNhuanTruocThue(null);
            dauKy.setTangGiamHangTonKho(null);
            dauKy.setChiPhiQuanLyDoanhNghiep(null);
            dauKy.setTongLoiNhuanKeToanTruocThue(null);
            dauKy.setLoiNhuanSauThueTNDN(null);
            dauKy.setLoiNhuanSauThueCuaCongTyMe(null);
            dauKy.setChiPhiLaiVay_GianTiep(null);
            dauKy.setTangGiamCacKhoanPhaiThu(null);
            dauKy.setTangGiamCacKhoanPhaiTra(null);
            dauKy.setDtthuanVeBanHangVaCungCapDV(null);
            dauKy.setTangGiamChiPhiTraTruoc(null);
            dauKy.setKhauHaoTaiSanCoDinh(null);
            dauKy.setDoanhThuHoatDongTaiChinh(null);
            dauKy.setLoiIchCuaCoDongKhongKiemSoat(null);
            dauKy.setDieuChinhChoCacKhoan(null);
            dauKy.setCacKhoanGiamTruDoanhThu(null);
            dauKy.setLaiCoBanTrenCoPhieu(null);
            dauKy.setLaiLoTuHoatDongDauTu(null);
            dauKy.setLaiLoCongTyLKLD(null);
            dauKy.setDoanhThuBanHangVaCungCapDV(null);
            dauKy.setChiPhiHoatDongTaiChinh(null);
            dauKy.setLaiSuyGiamTrenCoPhieu(null);
            dauKy.setChiPhiThueTNDNHienHanh(null);
            dauKy.setChiPhiThueTNDNHoanLai(null);
            dauKy.setVonKhacCuaCSH413(null);
            dauKy.setCoTucLoiNhuanTraChoCSH(null);
            dauKy.setLctthuanTuHDTC(null);
            dauKy.setAnhHuongCuaThayDoiTyGia(null);
            dauKy.setTienTraNoGocThueTC(null);
            dauKy.setLctthuanTrongKy(null);
            dauKy.setTienChiTraNoGocVay(null);
            dauKy.setTienThuKhacTuHDKD(null);
            dauKy.setThueThuNhapDoanhNghiepDaNop(null);
            dauKy.setTienChiKhacChoHDKD(null);
            dauKy.setTienLaiVayDaTra_LCTT_GianTiep(null);
            dauKy.setTienVaTuongDuongTienCuoiKy(null);
            dauKy.setThuTienBanHang(null);
            dauKy.setCoTucLoiNhuanDaTraChoChuSoHuu(null);
            dauKy.setTienChiChoVayMuaCongCuNoDVK(null);
            dauKy.setLctthuanTuHDKD(null);
            dauKy.setTienChiTraNoThueTaiChinh(null);
            dauKy.setTangGiamChungKhoanKinhDoanh(null);
            dauKy.setTienTraChoNguoiCungCapHHDV(null);
            dauKy.setTienTraChoNguoiLaoDong(null);
            dauKy.setTienLaiVayDaTra_LCTT_TrucTiep(null);
            dauKy.setTienChiTraVonGopChoCSH(null);
            dauKy.setTienThuThanhLyNhuongBanTSCD(null);
            dauKy.setTienVayNganHanDaiHanNhanDuoc(null);
            dauKy.setTienChiDauTuGopVonVaoDVK(null);
            dauKy.setTienThuHoiDauTuVonVaoDVK(null);
            dauKy.setTienChiVonGopChoCSH(null);
            dauKy.setTienTraNoGocVay(null);
            dauKy.setTienThuTuDiVay(null);
            dauKy.setLuuChuyenTienThuanTrongKy(null);
            dauKy.setTienVaTuongDuongTienDauKy(null);
            dauKy.setLoiNhuanTuHoatDongKinhDoanhTruocThayDoiVonLuuDong(null);
            dauKy.setTienThuHoiDauTuGopVonVaoDonViKhac(null);
            dauKy.setTienChiKhacChoHoatDongKinhDoanh(null);
            dauKy.setTienThuTuThanhLyNhuongBanTSCDVaTSDaiHanKhac(null);
            dauKy.setTienThuKhacTuHoatDongKinhDoanh(null);
            dauKy.setLuuChuyenTienThuanTuHoatDongDauTu(null);
            dauKy.setTienThuTuPhatHanhCoPhieuNhanVonGopCuaChuSoHuu(null);
            dauKy.setTienThuLaiChoVayCoTucVaLoiNhuanDuocChia(null);
            dauKy.setLoiNhuanSauThueChuaPhanPhoi417(null);
            dauKy.setTienChiChoVayMuaCacCongCuNoCuaDonViKhac(null);
            dauKy.setTienThuHoiChoVayBanLaiCacCongCuNoCuaDonViKhac(null);
            dauKy.setLuuChuyenTienThuanTuHoatDongKinhDoanh(null);
            dauKy.setTienChiDeMuaSamXayDungTSCDVaTSDaiHanKhac(null);
            dauKy.setTienChiDauTuGopVonVaoDonViKhac(null);
            dauKy.setLaiLoChenhLechTyGiaHoiDoaiChuaThucHien(null);
            tt113.setDauKy(dauKy);
            tt113.setDauKy(dauKy);
            Batch batch1 = new Batch();
            batch1.setBatchID(3);
            batch1.setBieuMauBCTC("TT133");
            batch1.setLoaiBCTC("Thuế");
            batch1.setDonViTinh("Đồng");
            batch1.setNguonDuLieu("Bên thứ 3 cung cấp");
            batch1.setNamBCTC("2019");
            tt113.setBatch(batch1);


            CuoiKy cuoiKy = new CuoiKy();
            cuoiKy.setThuNhapKhac_(0.0);
            cuoiKy.setChiPhiKhac_(42.0);
            cuoiKy.setBdsdauTu154_(0.0);
            cuoiKy.setNguyenGia158_(0.0);
            cuoiKy.setNoPhaiTra300_(11400659059.0);
            cuoiKy.setNguyenGia151_(5076931283.0);
            cuoiKy.setTienTonDauKy_(682096395);
            cuoiKy.setTienMuaTSCD_(0.0);
            cuoiKy.setLcttuHDDT_(-11872444113.0);
            cuoiKy.setLoiNhuanKhac_(-42.0);
            cuoiKy.setDauTuTaiChinh111_(21852102699.0);
            cuoiKy.setGiaTriHaoMonLuyKe159_(0.0);
            cuoiKy.setPhaiTraNoiBo317_(0.0);
            cuoiKy.setVayVaNoThueTC316_(10223571408.0);
            cuoiKy.setDuPhongPhaiTra318_(0.0);
            cuoiKy.setTaiSanCoDinh150_(1022459934);
            cuoiKy.setDuPhongPhaiThuKhoDoi139_(0.0);
            cuoiKy.setHangTonKho141_(11934229421.0);
            cuoiKy.setXdcbdoDang210_(0.0);
            cuoiKy.setDauTuNamGiuDenNgayDaoHan120_(0.0);
            cuoiKy.setDauTuGopVonVaoDVK121_(21852102699.0);
            cuoiKy.setThueGTGTDuocKhauTru212_(337676011);
            cuoiKy.setVonDauTuCuaCSH411_(3.0E+10);
            cuoiKy.setThangDuVonCoPhan412_(0.0);
            cuoiKy.setTraTruocChoNguoiBan132_(1.255E+8);
            cuoiKy.setNguoiMuaTraTienTruoc312_(1.66972E+7);
            cuoiKy.setTienVaCacKhoanTuongDuong110_(4581979117.0);
            cuoiKy.setTaiSanThieuChoXuLy135_(0.0);
            cuoiKy.setPhaiTraNguoiBan311_(1160390451);
            cuoiKy.setDuPhongGiamGiaHTK149_(0.0);
            cuoiKy.setTaiSanKhac211_(501559946);
            cuoiKy.setVonKinhDoanhDVTrucThuoc133_(0.0);
            cuoiKy.setHangTonKho140_(11934229421.0);
            cuoiKy.setThueVaCacKhoanPhaiNopNN313_(0.0);
            cuoiKy.setDuPhongTonThatDTTC129_(0.0);
            cuoiKy.setPhaiThuCuaKhachHang131_(4.164E+7);
            cuoiKy.setChungKhoanKinhDoanh112_(0.0);
            cuoiKy.setPhaiTraNguoiLaoDong314_(0.0);
            cuoiKy.setTaiSanKhac213_(163883935);
            cuoiKy.setPhaiTraKhac315_(0.0);
            cuoiKy.setQuyKhenThuongPhucLoi319_(0.0);
            cuoiKy.setQuyPhatTrienKHCN320_(0.0);
            cuoiKy.setVonChuSoHuu400_(28658812058.0);
            cuoiKy.setTongConTaiSan200_(40059471117.0);
            cuoiKy.setPhaiThuKhac134_(0.0);
            cuoiKy.setGiaTriHaoMonLuyKe152_(-4054471349.0);
            cuoiKy.setCacKhoanPhaiThu130_(1.6714E+8);
            cuoiKy.setChenhLechTyGiaHoiDoai415_(0.0);
            cuoiKy.setChiPhiThueTNDNHienHanh_(0.0);
            cuoiKy.setChiPhiHoatDongTaiChinh_(748026498);
            cuoiKy.setDtthuanVeBanHangVaCungCapDV_(27385134183.0);
            cuoiKy.setGiaVonBanhang_(23595339274.0);
            cuoiKy.setChiPhiLaiVay_LCTT_GianTiep_(748026498);
            cuoiKy.setCoPhieuQuy414_(0.0);
            cuoiKy.setCacKhoanDieuChinhKhac_(0.0);
            cuoiKy.setTangGiamHangTonKho_(0.0);
            cuoiKy.setCacKhoanDuPhong_(0.0);
            cuoiKy.setTangGiamCacKhoanPhaiThu_(0.0);
            cuoiKy.setTangGiamCacKhoanPhaiTra_(0.0);
//        cuoiKy.setChiPhiThueTNDNHoanLai_(null);
//        cuoiKy.setLoiIchCuaCoDongKhongKiemSoat_(null);
            cuoiKy.setLoiNhuanSauThueTNDN_(147147167);
            cuoiKy.setLnthuanTuHDKD_(147147209);
            cuoiKy.setLoiNhuanTruocThue_(0.0);
//        cuoiKy.setLaiSuyGiamTrenCoPhieu_(11);
            cuoiKy.setCacKhoanGiamTruDoanhThu_(0.0);
            cuoiKy.setChiPhiQuanLyDoanhNghiep_(2894834747.0);
//        cuoiKy.setLoiNhuanSauThueCuaCongTyMe_(11);
            cuoiKy.setLngopVeBanHangVaCungCapDV_(3789794909.0);
            cuoiKy.setCacQuyThuocVonCSH416_(0.0);
            cuoiKy.setVonKhacCuaCSH413_(0.0);
            cuoiKy.setTongLoiNhuanKeToanTruocThue_(147147167);
//        cuoiKy.setLaiCoBanTrenCoPhieu_(11);
            cuoiKy.setDoanhThuBanHangVaCungCapDV_(27385134183.0);
            cuoiKy.setDieuChinhChoCacKhoan_(0.0);
//        cuoiKy.setChiPhiLaiVay_KQKD_(11);
            cuoiKy.setKhauHaoTaiSanCoDinh_(0.0);
            cuoiKy.setLaiLoTuHoatDongDauTu_(0.0);
            cuoiKy.setTongCongNguonVon500_(40059471117.0);
            cuoiKy.setDoanhThuHoatDongTaiChinh_(213545.0);
//        cuoiKy.setChiPhiBanHang_(11);
//        cuoiKy.setLaiLoCongTyLKLD_(11);
            cuoiKy.setThueTNDNDaNop_(0.0);
            cuoiKy.setLctthuanTuHDKD_(15772326835.0);
            cuoiKy.setAnhHuongCuaThayDoiTyGia_(0.0);
            cuoiKy.setTienChiDauTuGopVonVaoDVK_(0.0);
            cuoiKy.setTienVaTuongDuongTienDauKy_(0.0);
            cuoiKy.setTangGiamChungKhoanKinhDoanh_(0.0);
            cuoiKy.setTangGiamChiPhiTraTruoc_(0.0);
            cuoiKy.setTienVaTuongDuongTienCuoiKy_(0.0);
            cuoiKy.setTienThuHoiDauTuVonVaoDVK_(0.0);
            cuoiKy.setTienChiVonGopChoCSH_(0.0);
            cuoiKy.setThueThuNhapDoanhNghiepDaNop_(0.0);
            cuoiKy.setTienThuTuDiVay_(0.0);
            cuoiKy.setTienTraChoNguoiCungCapHHDV_(-8279091287.0);
            cuoiKy.setTienTraNoGocVay_(0.0);
//        cuoiKy.setTienTraNoGocThueTC_(11);
            cuoiKy.setLctthuanTuHDTC_(0.0);
            cuoiKy.setTienTonCuoiKy_(4581979117.0);
            cuoiKy.setTienChiTraNoThueTaiChinh_(0.0);
            cuoiKy.setTienTraChoNguoiLaoDong_(-2034945382);
//        cuoiKy.setTienChiTraNoGocVay_(11);
            cuoiKy.setTienChiKhacChoHDKD_(0.0);
            cuoiKy.setTienThuThanhLyNhuongBanTSCD_(0.0);
            cuoiKy.setTienChiChoVayMuaCongCuNoDVK_(-11872444113.0);
            cuoiKy.setThuTienBanHang_(26540849707.0);
            cuoiKy.setCoTucLoiNhuanTraChoCSH_(0.0);
            cuoiKy.setTienThuKhacTuHDKD_(293540295);
            cuoiKy.setLctthuanTrongKy_(3899882722.0);
            cuoiKy.setTienChiTraVonGopChoCSH_(0.0);
            cuoiKy.setLuuChuyenTienThuanTrongKy_(0.0);
            cuoiKy.setTienVayNganHanDaiHanNhanDuoc_(0.0);
            cuoiKy.setLoiNhuanSauThueChuaPhanPhoi417_(-1341187942);
            cuoiKy.setTienThuKhacTuHoatDongKinhDoanh_(0.0);
            cuoiKy.setTienChiKhacChoHoatDongKinhDoanh_(0.0);
            cuoiKy.setLuuChuyenTienThuanTuHoatDongKinhDoanh_(0.0);
            cuoiKy.setLaiLoChenhLechTyGiaHoiDoaiChuaThucHien_(0.0);
            cuoiKy.setTienThuTuThanhLyNhuongBanTSCDVaTSDaiHanKhac_(0.0);
            cuoiKy.setTienLaiVayDaTra_LCTT_GianTiep_(0.0);
            cuoiKy.setLoiNhuanTuHoatDongKinhDoanhTruocThayDoiVLD_(0.0);
            cuoiKy.setTienChiDeMuaSamXayDungTSCDVaTSDaiHanKhac_(0.0);
//        cuoiKy.setTienChiChoVayMuaCacCongCuNoCuaDonViKhac_(11);
            cuoiKy.setTienThuLaiChoVayCoTucVaLoiNhuanDuocChia_(0.0);
            cuoiKy.setTienThuTuPhatHanhCoPhieuNhanVonGopCuaCSH_(0.0);
            cuoiKy.setLuuChuyenTienThuanTuHoatDongTaiChinh_(0.0);
            cuoiKy.setTienLaiVayDaTra_LCTT_TrucTiep_(0.0);
//        cuoiKy.setTienThuHoiChoVayBanLaiCongCuNoDVK_(11);
            cuoiKy.setTienChiDauTuGopVonVaoDonViKhac_(0.0);
            cuoiKy.setThuLaiTienChoVayCoTucVaLNDuocChia_(0.0);
//        cuoiKy.setTienThuHoiChoVayBanLaiCacCongCuNoCuaDVK_(11);
            cuoiKy.setCoTucLoiNhuanDaTraChoChuSoHuu_(0.0);
            cuoiKy.setTienThuHoiDauTuGopVonVaoDonViKhac_(0.0);
            cuoiKy.setAnhHuongThayDoiTyGiaHoiDoaiQuyDoiNgoaiTe_(0.0);
            cuoiKy.setLuuChuyenTienThuanTuHoatDongDauTu_(0.0);
            cuoiKy.setTienThuTuPhatHanhCPNhanVonGopCSH_(0.0);
            tt113.setCuoiKy(cuoiKy);
            return new ResponseEntity<>(tt113, HttpStatus.OK);
















        } else if (auth.equals(value) && batchId1==batch.getBatchID()) {
            TT200 tt200 = new TT200();

            tt200.setCode("00");

            Batch batch1 = new Batch();
            batch1.setBatchID(10193);
            batch1.setBieuMauBCTC("TT200");
            batch1.setLoaiBCTC("Thuế");
            batch1.setDonViTinh("Đồng");
            batch1.setNguonDuLieu("Bên thứ 3 cung cấp");
            batch1.setNamBCTC("2019");
            tt200.setBatch(batch1);
            dauki1 dauKy1 = new dauki1(null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
            cuoiky1 cuoiky1 = new cuoiky1(0.0,
                    0.0,
                    94296635389.0,
                    0.0,
                    7500518625.0,
                    0.0,
                    277150272,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    198221725,
                    6.45474E+8,
                    0.0,
                    0.0,
                    0.0,
                    2.0E+10,
                    0.0,
                    19508492832.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    177053545,
                    53210400356.0,
                    0.0,
                    0.0,
                    9.8E+7,
                    0.0,
                    275053545,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    36858130332.0,
                    -16352270024.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    4549446.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    4549446.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    -491507168,
                    0.0,
                    0.0,
                    0.0,
                    94296635389.0,
                    0.0,
                    -48990003,
                    0.0,
                    0.0,
                    0.0,
                    44179992717.0,
                    44179992717.0,
                    19508492832.0,
                    40693852.0,
                    3340032205.0,
                    113585977544.0,
                    107633102517.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    162775407,
                    198919813,
                    0.0,
                    0.0,
                    0.0,
                    2415011675.0,
                    0.0,
                    5952875027.0,
                    203469259,
                    0.0,
                    113585977544.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    1088666.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    57438505057.0,
                    2326063352.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    1.01304125E+10,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    10657395443.0,
                    526982943,
                    0.0,
                    -442517165,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    0.0,
                    36858130332.0,
                    0.0,
                    36858130332.0,
                    2326063352.0,
                    0.0,
                    0.0,
                    38728900992.0,
                    0.0,
                    74788142557.0,
                    0.0,
                    0.0,
                    74788142557.0,
                    0.0);
            tt200.setCuoiKy(cuoiky1);

            return new ResponseEntity<>(tt200, HttpStatus.OK);
        } else {
            System.out.println("sai");
            return null;
        }
    }
}
