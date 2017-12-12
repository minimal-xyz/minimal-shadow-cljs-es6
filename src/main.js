
import {render} from 'react-dom'
import {createElement} from 'react'
import Container from './container'

export function main() {
  render(createElement(Container, null), document.querySelector('.app'))
}

export function reload() {
  window.location.reload()
}