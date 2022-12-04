package com.kja.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * @@RequiredArgsConstructor
 * 1. 필드에 final을 적용 
 * 2. 위 에노테이션 적용 시
 * - 해당 필드를 필요로 하는 생성자가 lombok에 의해 자동생성
 * - final을 적용했기 때문에 @Setter는 의미없음 
 */
/**
 * 아래 코드는 생성자를 직접 작성한 경우 (동일)
 * public HelloLombok(String hello, int lombok) {
 * 	this.hello = hello;
 *  this.lombok = lombok;
 * }
 */
@RequiredArgsConstructor
@Getter
public class HelloLombok {

    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로", 5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}